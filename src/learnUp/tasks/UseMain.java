package learnUp.tasks;

class UseMain  { // ���������� �������� �������
	public static void main(String args[]) {
		Thread thr;
		
		thr = Thread.currentThread(); // �������� �������� �����
		
		System.out.println("��� ��������� ������: " + thr.getName()); // ���������� ��� ��������� ������
		System.out.println("��������� ��������� ������: " + thr.getPriority()); // ���������� ��������� ��������� ������
		System.out.println();
		
		System.out.println("��������� ����� � ���������� ��������� ������"); //���������� ��� � ��������� ��������� ������
		thr.setName("Thread #1");
		thr.setPriority(Thread.NORM_PRIORITY + 3);
		System.out.println();
		
		System.out.println("����� ��� ��������� ������: " + thr.getName());
		System.out.println("����� ��������� ��������� ������: " + thr.getPriority());
	}
}