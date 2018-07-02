package learnUp;
//���������� ������ Thread
class ExtendThread extends Thread { // ������� ����� �����
	ExtendThread(String name) { 
		super(name); // ��������� ��� ������
		start(); // ��������� �����
	}

	public void run() { // ������ ���������� ������ ������
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("� " + getName() + " , �������: " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(getName() + " �������");
		}
		System.out.println(getName() + " - ����������");
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
				System.out.println("���������� ��������� ������");
			}
		}
		System.out.println("���������� ��������� ������");
	}
}