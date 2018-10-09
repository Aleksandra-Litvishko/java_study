package li.java.tasks.experiments;

class FirstClass {

	synchronized void myMeth(SecondClass sc) {
		System.out.println("метод myMeth() класса FirstClass");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException exc) {
			exc.printStackTrace();
		}
		System.out.println("Попытка вызвать метод last() класса FirstClass");
		sc.lastMeth();
	}

	synchronized void lastMeth() {
		System.out.println("В методе last() класса FirstClass");
	}
}

class SecondClass {

	synchronized void myMeth(FirstClass fc) {
		System.out.println("метод myMeth() класса SecondClass");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException exc) {
			exc.printStackTrace();
		}
		System.out.println("Попытка вызвать метод last() класса SecondClass");
		fc.lastMeth();
	}

	synchronized void lastMeth() {
		System.out.println("В методе last() класса SecondClass");
	}
}

public class Deadlock implements Runnable {
	FirstClass fc = new FirstClass();
	SecondClass sc = new SecondClass();
	
	Thread thr;

	Deadlock() {
		thr = new Thread(this);
		thr.start();
		fc.myMeth(sc);
	}
	
	public void run() {
		sc.myMeth(fc);
	}

	public static void main(String args[]) {
		Deadlock dl = new Deadlock();
	}
}