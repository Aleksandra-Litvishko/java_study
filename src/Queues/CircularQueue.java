package Queues;

class CircularQueue extends BaseQueue { //��������� �������
	private char q[], a[];
	private int putloc, getloc; // ������� ����������� � ����������� ���������;
	
	public CircularQueue(int size) {
		super(size+1);
		q = new char[size + 1];
		putloc = getloc = 0;
	}
	
	@Override()
	public void put(char ch) { // ������� ��������� ������, ���� ������ putloc �� ������� ������ ������� getloc ��� ���� ������ putloc ��������� �� ����� �������, � getloc �� ������
		if(putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
			System.out.println("������� ���������");
			return;
		}
		
		putloc++;
		if(putloc == q.length) { // ������� � ������ �������
			putloc = 0;
		}
		q[putloc] = ch;
	}
	
	@Override()
	public char get() {
		if(getloc == putloc) {
			System.out.println(" - ������� �����");
			return (char) 0;
		}
		
		getloc++;
		if(getloc == q.length) { // ������� � ������ �������
			getloc = 0;
		}
		return q[getloc];
	}
	
	@Override()
	public void reset() {
		a = new char[q.length];
		putloc = getloc = 0;
		q = a;
	}
}
