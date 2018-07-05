package learnUp;

class TickTock { // использование методов wait() и notify() для имитации часов
	String state; // содержит сведения о состоянии часов
	synchronized void tick(boolean running) {
		if (!running) { // остановить часы
			state = "ticked";
			notify(); // уведомить ожидающие потоки
			return;
		}

		System.out.print("Tick ");

		state = "ticked"; // установить текущее состояние просле такта "тик"
		
		notify(); // метод tick() посылает уведомления методу tock()
		try {
			while (!state.equals("tocked")) 
				wait(); // метод tick() ожидает завершения метода tock();
		} catch (InterruptedException exc) {
			System.out.println("Прерывание основного потока");
		}
	}

	synchronized void tock(boolean running) {
		if (!running) { // остановить часы
			state = "tocked";
			notify(); // уведомить ожидающие потоки
			return;
		}

		System.out.print("Tock\n");

		state = "tocked"; // установить текущее состояние просле такта "так"
		
		notify();// метод tock() посылает уведомления методу tick()
		try {
			while (!state.equals("ticked")) {
				wait();// метод tock() ожидает завершения метода tick();
			}
		} catch (InterruptedException exc) {
			System.out.println("Прерывание основного потока");
		}
	}
}

class MyThr implements Runnable {
	Thread thr;
	TickTock ttOb;

	MyThr(String name, TickTock tt) {
		thr = new Thread(this, name);
		ttOb = tt;
		thr.start();
	}

	public void run() {
		if (thr.getName().compareTo("Tick") == 0) {
			for (int i = 0; i < 5; i++) ttOb.tick(true);
			ttOb.tick(false);
		}
		
		else {
			for (int i = 0; i < 5; i++) ttOb.tock(true);
			ttOb.tock(false);
		}	
	}
}

class ThreadCom {
	public static void main(String args[]) {
		TickTock tt = new TickTock();
		MyThr a = new MyThr("Tick", tt);
		MyThr b = new MyThr("Tock", tt);
		
		try {
			a.thr.join();
			b.thr.join();
		} catch(InterruptedException exc) {
			System.out.println("Прерывание основного потока");
		}
	}
}
