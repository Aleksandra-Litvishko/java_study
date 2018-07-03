package learnUp;

class MyStThread implements Runnable {
	Thread thr;
	String name;
	
	MyStThread (String name) {
		this.name = name;
		thr = new Thread(this, name);
		thr.start();
	}
	
	public void run() {
		System.out.println(name + " - запуск");
		try {
			for(int count = 0;count < 10; count++) {
				Thread.sleep(400);
				System.out.println("В " + name + " , счётчик: " + count);
			}
		}catch(InterruptedException exc) {
			System.out.println(name + " прерван");
		}
		System.out.println(name + " - завершение");
	}
}

class MoreThreads {
	public static void main(String args[]) {
		MyStThread mst1 = new MyStThread("Child#1"); 
		MyStThread mst2 = new MyStThread("Child#2");
		MyStThread mst3 = new MyStThread("Child#3"); //создание и запуск на выполнение трёх потоков
		
		 do {
				System.out.print(".");
				try {
			Thread.sleep(100);
				} catch(InterruptedException exc) {
					System.out.println("Прерывание основного потока");
				}
			} while(mst1.thr.isAlive() || // ожидание завершения всех потоков
					mst2.thr.isAlive() ||
					mst3.thr.isAlive());
			System.out.println("Завершение основного потока");
	}
}