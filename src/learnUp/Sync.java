package learnUp;

class SumArray {
	private int sum;

	synchronized int sumArray(int nums[]) {
		sum = 0; //обнулить сумму

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.println("Текущее значение суммы для " + Thread.currentThread().getName() + ": " + sum);
			try {
				Thread.sleep(10);
			} catch (InterruptedException exc) {
				System.out.println("Прерывание основного потока");
			}
		}
		return sum;
	}
}

class MyThreadWithSync implements Runnable {
	Thread thr;
	static SumArray sa = new SumArray();
	int a[];
	int answer;

	MyThreadWithSync(String str, int nums[]) {
		thr = new Thread(this, str);
		a = nums;
		thr.start();
	}

	public void run() {
		int sum;
		System.out.println(thr.getName() + " -запуск");

		answer = sa.sumArray(a);
		System.out.println("СУММА для " + thr.getName() + ": " + answer);
		System.out.println(thr.getName() + " - завершение");
	}
}

class Sync {
	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15,16 };
		MyThreadWithSync mt = new MyThreadWithSync("Child#1", a);
		MyThreadWithSync mt2 = new MyThreadWithSync("Child#2", a);
	}
}