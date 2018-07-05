package learnUp;

class SummArray {
	private int sum;

	int summArray(int nums[]) { // summArray() �� ���������������
		sum = 0; //�������� �����

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.println("������� �������� ����� ��� " + Thread.currentThread().getName() + ": " + sum);
			try {
				Thread.sleep(10);
			} catch (InterruptedException exc) {
				System.out.println("���������� ��������� ������");
			}
		}
		return sum;
	}
}

class MyThreads implements Runnable {
	Thread thr;
	static SummArray sa = new SummArray();
	int a[];
	int answer;

	MyThreads(String str, int nums[]) {
		thr = new Thread(this, str);
		a = nums;
		thr.start();
	}

	public void run() {
		int sum;
		System.out.println(thr.getName() + " -������");

		synchronized(sa) { 
		answer = sa.summArray(a);//������ ������ sumArray() ��� ������� sa ����������������
		}
		System.out.println("����� ��� " + thr.getName() + ": " + answer);
		System.out.println(thr.getName() + " - ����������");
	}
}

class SyncBlock {
	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15,16 };
		
		MyThreads mt = new MyThreads("Child#1", a);
		MyThreads mt2 = new MyThreads("Child#2", a);
	}
}