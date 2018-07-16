package learnUp.tasks;

enum TrafficLightColor1 { // ������������ ��� ����������� ������ ���������
	RED, YELLOW, GREEN;
	
	boolean changed;
	boolean stopped;
}

class TrafficLightSimulator1 implements Runnable { // �����, ��������������� �������� ���������
	private Thread thr; // ����� ��� �������� ���������
	private TrafficLightColor1 tlc; // ������� ���� ���������

	TrafficLightSimulator1(TrafficLightColor1 init) {
		tlc = init;
		thr = new Thread(this);
		thr.start();
	}

	TrafficLightSimulator1() {
		tlc = TrafficLightColor1.RED;
		thr = new Thread(this);
		thr.start();
	}

	public void run() {
		while (!tlc.stopped) {
			try {
				switch (tlc) {
				case GREEN:
					Thread.sleep(10000); // ������ 10 ���
					break;
				case YELLOW:
					Thread.sleep(2000); // ����� 2 c��
					break;
				case RED:
					Thread.sleep(12000); // ������� 12 ���
					break;
				}
			} catch (InterruptedException exc) {
				exc.printStackTrace();
			}
			changeColor();
		}
	}

	synchronized void changeColor() {
		switch (tlc) {
		case RED:
			tlc = TrafficLightColor1.YELLOW;
			break;
		case YELLOW:
			tlc = TrafficLightColor1.GREEN;
			break;
		case GREEN:
			tlc = TrafficLightColor1.RED;
			break;
		}
		tlc.changed = true;
		notify();
	}

	synchronized void waitForChange() {
		try {
			while (!tlc.changed) {
				wait();
				}
				tlc.changed = false;
		} catch (InterruptedException exc) {
			exc.printStackTrace();
		}
	}

	TrafficLightColor1 getColor() {
		return tlc;
	}

	void cancel() {
		tlc.stopped = true;
	}
}

class TrafficLightDemoCoolEnum {
	public static void main(String args[]) {
		TrafficLightSimulator1 t1 = new TrafficLightSimulator1(TrafficLightColor1.GREEN);
		for (int i = 0; i < 9; i++) {
			System.out.println(t1.getColor());
			t1.waitForChange();
		}
		t1.cancel();
	}
}