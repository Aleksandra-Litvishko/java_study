package learnUp;

class JoinThreads {
	public static void main(String args[]) {
		MyStThread child1 = new MyStThread("Child�1");
		MyStThread child2 = new MyStThread("Child�2");
		MyStThread child3 = new MyStThread("Child�3");
		
		try {
		child1.thr.join(); // �������� �� ��� ���, ���� ��������� ����� �� ����������
		child2.thr.join(); // �������� �� ��� ���, ���� ��������� ����� �� ����������
		child3.thr.join(); // �������� �� ��� ���, ���� ��������� ����� �� ����������
		} catch (InterruptedException exc) {
			System.out.println("���������� ��������� ������");
		}
			System.out.println("���������� ��������� ������");
	}
}