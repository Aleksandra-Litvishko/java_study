package li.java.tasks.lambda;

enum TrafficLightColor { // перечисление для обозначения цветов светофора
	RED(10000), YELLOW(2000), GREEN(12000);

	private int delay;

	TrafficLightColor(int delay) {
		this.delay = delay;
	}

	public int getDelay() {
		return delay;
	}
}

class TrafficLightSimulator implements Runnable { // класс, инкапсулирующий имитацию светофора
	private Thread thr; // поток для имитации светофора
	private TrafficLightColor tlc; // текущий цвет светофора
	boolean stop = false; // для остановки имитации установить в true
	boolean changed = false; // true, если светофор переключился

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
				Thread.sleep(tlc.getDelay());
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