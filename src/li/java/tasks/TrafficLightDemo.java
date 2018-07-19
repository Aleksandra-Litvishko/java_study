package li.java.tasks;

enum TrafficLightColor { // ������������ ��� ����������� ������ ���������
	RED, YELLOW, GREEN;
}

class TrafficLightSimulator implements Runnable { // �����, ��������������� �������� ���������
	private Thread thr; // ����� ��� �������� ���������
	private TrafficLightColor tlc; // ������� ���� ���������
	boolean stop = false; // ��� ��������� �������� ���������� � true
	boolean changed = false; // true, ���� �������� ������������

	TrafficLightSimulator(TrafficLightColor init) {
		tlc = init;
		thr = new Thread(this);
		thr.start();
	}

	TrafficLightSimulator() {
		tlc = TrafficLightColor.RED;
		thr = new Thread(this);
		thr.start();
	}

	public void run() {
		while (!stop) {
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
			tlc = TrafficLightColor.YELLOW;
			break;
		case YELLOW:
			tlc = TrafficLightColor.GREEN;
			break;
		case GREEN:
			tlc = TrafficLightColor.RED;
			break;
		}
		changed = true;
		notify();
	}

	synchronized void waitForChange() {
		try {
			while (!changed) {
				wait();
				}
				changed = false;
		} catch (InterruptedException exc) {
			exc.printStackTrace();
		}
	}

	TrafficLightColor getColor() {
		return tlc;
	}

	void cancel() {
		stop = true;
	}
}

class TrafficLightDemo {
	public static void main(String args[]) {
		TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
		for (int i = 0; i < 9; i++) {
			System.out.println(t1.getColor());
			t1.waitForChange();
		}
		t1.cancel();
	}
}