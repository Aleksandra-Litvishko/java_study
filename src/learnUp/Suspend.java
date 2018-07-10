package learnUp;

class MyThrd implements Runnable {
	Thread thr;
	boolean stopped; // ������������� ����� ��� �������� false
	boolean suspended; // ���������������� ����� ��� �������� true
	
	MyThrd(String name) {
		thr = new Thread(this, name);
		suspended = false;
		stopped = false;
		thr.start();
	}
	
	public void run() {
		System.out.println(thr.getName() + " - ������");
		try {
			for(int i = 1; i < 1000; i++) {
				System.out.print(i + " ");
				if((i%10) == 0) {
					System.out.println();
					Thread.sleep(250);
				}
				
				synchronized(this) { // ���� ������������������ ���� ����������� ��� ������������ ���������� suspended � stopped
					while(suspended) {
						wait();
					}
					if(stopped) break;
				}
						}
		} catch(InterruptedException exc) {
			System.out.println(thr.getName() + " - �������");
		}
		System.out.println(thr.getName() + " - �����");
	} 

	synchronized void mystop() { //������ ��������� ����������������� ������
		stopped = true;
		suspended = false;
		notify();
	}
	synchronized void mysuspend() { //������������� �����
		suspended = true;
	}
	synchronized void myresume() { //����������� �����
		suspended = false;
		notify();
	}
}

class Suspend {
	public static void main(String args[]) {
		MyThrd ob1 = new MyThrd("Child#1");
		
		try {
			Thread.sleep(1000); // ����� ����� ob1 ����� ��� ����������
			
			ob1.mysuspend();
			System.out.println("������������ ������");
			Thread.sleep(1000);
			
			ob1.myresume();
			System.out.println("������������� ������");
			Thread.sleep(1000);
			
			ob1.mysuspend();
			System.out.println("������������ ������");
			Thread.sleep(1000);
			
			ob1.myresume();
			System.out.println("������������� ������");
			Thread.sleep(1000);
			
			ob1.mystop();
			System.out.println("��������� ������");
			
		} catch(InterruptedException exc) {
			exc.printStackTrace();
		}
		
		try {
			ob1.thr.join();
		}catch(InterruptedException exc) {
			exc.printStackTrace();
			System.out.println("���������� ��������� ������");
		}
		
		System.out.println("���������� ��������� ������");
	} 
}

