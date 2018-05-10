package learnUp;

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

class CircularQueue implements ICharQ {
	private char q[];
	private int putloc, getloc; // ������� ����������� � ����������� ���������;
	
	public CircularQueue(int size) {
		q = new char[size + 1];
		putloc = getloc = 0;
	}
	public void put(char ch) { // ������� ��������� ������, ���� ������ putloc �� ������� ������ ������� getloc ��� ���� ������ putloc ��������� �� ����� �������, � getloc �� ������
		if((putloc + 1 == getloc) | ((putloc == q.length - 1) & (getloc == 0))) {
			System.out.println("������� ���������");
		}
		putloc++;
		if(putloc == q.length) { // ������� � ������ �������
			putloc = 0;
		}
		q[putloc] = ch;
	}
	
	public char get() {
		if(putloc == getloc) {
			System.out.println(" - ������� �����");
			return (char) 0;
		}
		getloc++;
		
		if(getloc == q.length) { // ������� � ������ �������
			getloc = 0;
		}
		return q[getloc];
	}
}