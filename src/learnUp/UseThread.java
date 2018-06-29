package learnUp;
// �������� ������ ���� ���������� ���������� Runnable
class MyThread implements Runnable { // ������� ���� MyThread ����� ����������� � ��������� �������, ��� ��� ����� MyThread ��������� ��������� Runnable
	String thrdName;

	MyThread(String name) {
		thrdName = name;
	}
// ����� ����� � �����
	public void run() { // ������ �������� ����������� ������
		System.out.println(thrdName + " - ������");
		try {
			for(int count = 0;count < 10; count++) {
				Thread.sleep(400);
				System.out.println("� " + thrdName + " , �������: " + count);
			}
		}catch(InterruptedException exc) {
			System.out.println(thrdName + " �������");
		}
		System.out.println(thrdName + " - ����������");
}
}

class UseThread {
	public static void main(String args[]) {
		// ������� ������� ������ ���� MyThread
		MyThread mt = new MyThread("Child#1");// �������� ������������ �������
		// ����� ������������ ����� �� ������ ����� �������
		Thread newThread = new Thread(mt); // ������������ ������ ��� ����� �������
		// ������ ���������� ������
		newThread.start(); // ������ ������ �� ����������
		
		for(int i = 0; i < 50; i++ ) {
			System.out.print(".");
			try {
		Thread.sleep(100);
			} catch(InterruptedException exc) {
				System.out.println("���������� ��������� ������");
			}
		}
		System.out.println("���������� ��������� ������");
	}
}