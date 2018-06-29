package learnUp;
// создание потока путём реализации интерфейса Runnable
class MyThread implements Runnable { // объекты типа MyThread могут выполняться в отдельных потоках, так как класс MyThread реализует интерфейс Runnable
	String thrdName;

	MyThread(String name) {
		thrdName = name;
	}
// точка входа в поток
	public void run() { // отсюда начинают выполняться потоки
		System.out.println(thrdName + " - запуск");
		try {
			for(int count = 0;count < 10; count++) {
				Thread.sleep(400);
				System.out.println("В " + thrdName + " , счётчик: " + count);
			}
		}catch(InterruptedException exc) {
			System.out.println(thrdName + " прерван");
		}
		System.out.println(thrdName + " - завершение");
}
}

class UseThread {
	public static void main(String args[]) {
		// сначала создать объект типа MyThread
		MyThread mt = new MyThread("Child#1");// создание исполняемого объекта
		// Затем сформировать поток на основе этого объекта
		Thread newThread = new Thread(mt); // формирование потока для этого объекта
		// начать выполнение потока
		newThread.start(); // запуск потока на выполнение
		
		for(int i = 0; i < 50; i++ ) {
			System.out.print(".");
			try {
		Thread.sleep(100);
			} catch(InterruptedException exc) {
				System.out.println("Прерывание основного потока");
			}
		}
		System.out.println("Завершение основного потока");
	}
}