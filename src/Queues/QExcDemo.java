package Queues;

class QExcDemo {
	public static void main(String args[]) {
		FixedQueue fq = new FixedQueue(10);
		
		char ch;
		
		try { // ������������ �������
			for(int i = 0; i < 11; i++) {
				System.out.print("������� ����������: " + (char) ('A' + i) +" ");
				fq.put((char) ('A' + i));
				System.out.println("- ��");
			}
		}
		catch(QueueFullException exc) {
			System.out.println(exc);
		}
		
		System.out.println(" ");
		
		try {
			for(int i = 0; i < 11; i++) {
				System.out.print("������� ����������: ");
				ch = fq.get();
				System.out.print(ch);
				System.out.println(" - ��");
			}
		}
		catch(QueueEmptyException exc) {
			System.out.println(exc);
		}
	}
}