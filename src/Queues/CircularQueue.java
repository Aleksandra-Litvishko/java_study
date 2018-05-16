package Queues;

public class CircularQueue extends Queue implements ICharQ { //��������� �������
	
	public CircularQueue(int size) {
		super(size);
	}
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
	
	public void reset() {
		a = new char[q.length];
		putloc = getloc = 0;
		q = a;
	}
}
