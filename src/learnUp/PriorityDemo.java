package learnUp;

class Priority implements Runnable {
	Thread thr;
	int count;

	static boolean stop = false;
	static String currentName;

	Priority(String name) {
		thr = new Thread(this, name);
		currentName = name;
		count = 0;
	}

	public void run() {
		System.out.println(thr.getName() + " запуск");
		do {
			count++;

			if (currentName.compareTo(thr.getName()) != 0) {
				currentName = thr.getName();
			}
		} while (stop == false && count < 10_000_000);
		stop = true;

		System.out.println(thr.getName() + " - завершение");
	}
}

class PriorityDemo {
	public static void main(String args[]) {
		Priority high = new Priority("High priority");
		Priority low = new Priority("Low priority");

		high.thr.setPriority(Thread.NORM_PRIORITY + 4);
		low.thr.setPriority(Thread.NORM_PRIORITY - 4);

		high.thr.start();
		low.thr.start();

		try {
			high.thr.join();
			low.thr.join();
		} catch (InterruptedException exc) {
			System.out.println("Прерывание основного потока");
		}
		System.out.println("Счётчик потока high Priority: " + high.count);
		System.out.println("Счётчик потока low Priority: " + low.count);
		System.out.println("Завершение основного потока");
	}
}