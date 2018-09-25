package li.java.tasks.experiments;

class State {
	private volatile State instance;
	private String condition;

	private State() {
	};

	public State getInstance() {
		if (instance == null) {
			synchronized (this) {
				State instance = new State();
				return instance;
			}
		} else
			return instance;
	}
	
	public void setCondition(String cond) {
		condition = cond;
	};
}

class Tick extends Thread {

	Tick(String n) {
		super(n);
		start();
	}

	public void run() {
		System.out.println("tick");
		synchronized (this) {
			try {
				wait(500);
			} catch (InterruptedException exc) {
				exc.printStackTrace();
			}
		}

		synchronized (this) {
			notify();
		}
	}
}

class Tock extends Thread {

	Tock(String n) {
		super(n);
		start();
	}

	public void run() {
		System.out.println("tock");

		synchronized (this) {
			try {
				wait(500);
			} catch (InterruptedException exc) {
				exc.printStackTrace();
			}
		}
		synchronized (this) {
			notify();
		}
	}
}

public class Threads {
	public static void main(String args[]) {
		Tick tick = new Tick("tick");
		Tock tock = new Tock("tock");
	}
}
