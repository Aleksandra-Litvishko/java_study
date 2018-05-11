package Queues;

class FixedQueue implements ICharQ {
	private char q[];
	private int putloc, getloc; // ������� ����������� � ����������� ���������;
	
	public FixedQueue(int size) {
		q = new char[size + 1];
		putloc = getloc = 0;
	}
	
	public void put(char ch) {
		if(putloc == q.length - 1) {
			System.out.println("������� ���������");
		}
		putloc++;
		q[putloc] = ch;
	}
	
	public char get() {
		if(putloc == getloc) {
			System.out.println("������� �����");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}
}
