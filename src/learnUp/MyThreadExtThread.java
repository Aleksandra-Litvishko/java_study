package learnUp;
//расширение класса Thread
class ExtendThread extends Thread { // создать новый поток
	ExtendThread(String name) { 
		super(name); // присвоить имя потоку
		start(); // запустить поток
	}

	public void run() { // начать выполнение нового потока
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("В " + getName() + " , счётчик: " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(getName() + " прерван");
		}
		System.out.println(getName() + " - завершение");
	}
}

class MyThreadExtThread {
	public static void main(String args[]) {
		ExtendThread et = new ExtendThread("Child#1");

		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Прерывание основного потока");
			}
		}
		System.out.println("Завершение основного потока");
	}
}