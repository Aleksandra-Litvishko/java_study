package learnUp;

class NewMyThread implements Runnable { // ������������������� ������ UseThread
	Thread thr;
	String name; //  � ���� ���������� �������� ������ �� �����
	
	NewMyThread(String name) {
		this.name = name;
		thr = new Thread(this, name); // ��� ������������� ������ ��� ��� ��������
				thr.start(); // ������ ���������� ������
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
 class UseThreadBecameBetter {
	 public static void main(String args[]) {
		 NewMyThread nmt = new NewMyThread("Child#1");
		 
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