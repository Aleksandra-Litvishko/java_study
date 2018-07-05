package learnUp;

class TickTock { // ������������� ������� wait() � notify() ��� �������� �����
	String state; // �������� �������� � ��������� �����
	synchronized void tick(boolean running) {
		if (!running) { // ���������� ����
			state = "ticked";
			notify(); // ��������� ��������� ������
			return;
		}

		System.out.print("Tick ");

		state = "ticked"; // ���������� ������� ��������� ������ ����� "���"
		
		notify(); // ����� tick() �������� ����������� ������ tock()
		try {
			while (!state.equals("tocked")) 
				wait(); // ����� tick() ������� ���������� ������ tock();
		} catch (InterruptedException exc) {
			System.out.println("���������� ��������� ������");
		}
	}

	synchronized void tock(boolean running) {
		if (!running) { // ���������� ����
			state = "tocked";
			notify(); // ��������� ��������� ������
			return;
		}

		System.out.print("Tock\n");

		state = "tocked"; // ���������� ������� ��������� ������ ����� "���"
		
		notify();// ����� tock() �������� ����������� ������ tick()
		try {
			while (!state.equals("ticked")) {
				wait();// ����� tock() ������� ���������� ������ tick();
			}
		} catch (InterruptedException exc) {
			System.out.println("���������� ��������� ������");
		}
	}
}

class MyThr implements Runnable {
	Thread thr;
	TickTock ttOb;

	MyThr(String name, TickTock tt) {
		thr = new Thread(this, name);
		ttOb = tt;
		thr.start();
	}

	public void run() {
		if (thr.getName().compareTo("Tick") == 0) {
			for (int i = 0; i < 5; i++) ttOb.tick(true);
			ttOb.tick(false);
		}
		
		else {
			for (int i = 0; i < 5; i++) ttOb.tock(true);
			ttOb.tock(false);
		}	
	}
}

class ThreadCom {
	public static void main(String args[]) {
		TickTock tt = new TickTock();
		MyThr a = new MyThr("Tick", tt);
		MyThr b = new MyThr("Tock", tt);
		
		try {
			a.thr.join();
			b.thr.join();
		} catch(InterruptedException exc) {
			System.out.println("���������� ��������� ������");
		}
	}
}
