package li.java.tasks.experiments;

class FirstClass {

	synchronized void myMeth(SecondClass sc) {
		System.out.println("����� myMeth() ������ FirstClass");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException exc) {
			exc.printStackTrace();
		}
		System.out.println("������� ������� ����� last() ������ FirstClass");
		sc.lastMeth();
	}

	synchronized void lastMeth() {
		System.out.println("� ������ last() ������ FirstClass");
	}
}

class SecondClass {

	synchronized void myMeth(FirstClass fc) {
		System.out.println("����� myMeth() ������ SecondClass");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException exc) {
			exc.printStackTrace();
		}
		System.out.println("������� ������� ����� last() ������ SecondClass");
		fc.lastMeth();
	}

	synchronized void lastMeth() {
		System.out.println("� ������ last() ������ SecondClass");
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