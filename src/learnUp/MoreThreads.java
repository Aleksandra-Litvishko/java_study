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
		System.out.println(name + " - ������");
		try {
			for(int count = 0;count < 10; count++) {
				Thread.sleep(400);
				System.out.println("� " + name + " , �������: " + count);
			}
		}catch(InterruptedException exc) {
			System.out.println(name + " �������");
		}
		System.out.println(name + " - ����������");
	}
}

class MoreThreads {
	public static void main(String args[]) {
		MyStThread mst1 = new MyStThread("Child#1"); 
		MyStThread mst2 = new MyStThread("Child#2");
		MyStThread mst3 = new MyStThread("Child#3"); //�������� � ������ �� ���������� ��� �������
		
		 do {
				System.out.print(".");
				try {
			Thread.sleep(100);
				} catch(InterruptedException exc) {
					System.out.println("���������� ��������� ������");
				}
			} while(mst1.thr.isAlive() || // �������� ���������� ���� �������
					mst2.thr.isAlive() ||
					mst3.thr.isAlive());
			System.out.println("���������� ��������� ������");
	}
}