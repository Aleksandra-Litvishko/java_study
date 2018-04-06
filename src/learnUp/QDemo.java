package learnUp;

class Queue {  // �����, ����������� ������� ��� �������� ��������
	char q[]; // ������ ��� �������� ��������� �������
	int q1[];
	double q2[];
	
	int putloc, getloc; // ������� ��� ������� � ���������� ��������� �������
	int putloc1, getloc1;
	int putloc2, getloc2;
	
	Queue (int size) { // ����������� ������
		q = new char[size + 1]; // ���������� ������ ��� ������� (��� �������)
		
		q1 = new int[size + 1];
		q2 = new double[size + 1];
		
		putloc = getloc = 0; // ������������� ����������, ������� ����� ��������� ���� �������� ��� ������� � ���������� ������
	}
	
	void put(char ch) { // �����, �������� ��������� ��������
		if(putloc == q.length-1) { // ���� putloc = ������ ������� - 1, �� ���������, ��� ������� ��������� � ���������� ������� �� ������ ���������� return
			System.out.println(" - ������� ���������");
			return;
		}
		
		putloc++; // ���� putloc < ������� ������� - 1, �� ����������� ��� ����� ������
		q[putloc] = ch; // ��������, ������������ ������ �������������� ���������� ������� � �������� putloc;
	}
	
	void put(int i) {
		if(putloc1 == q1.length-1) { // ���� putloc = ������ ������� - 1, �� ���������, ��� ������� ��������� � ���������� ������� �� ������ ���������� return
			System.out.println(" - ������� ���������");
			return;
		}
		
		putloc1++; // ���� putloc < ������� ������� - 1, �� ����������� ��� ����� ������
		q1[putloc1] = i; // ��������, ������������ ������ �������������� ���������� ������� � �������� putloc;
	}
	
	void put(double d) {
		if(putloc2 == q2.length-1) { // ���� putloc = ������ ������� - 1, �� ���������, ��� ������� ��������� � ���������� ������� �� ������ ���������� return
			System.out.println(" - ������� ���������");
			return;
		}
		
		putloc2++; // ���� putloc < ������� ������� - 1, �� ����������� ��� ����� ������
		q2[putloc2] = d; // ��������, ������������ ������ �������������� ���������� ������� � �������� putloc;
	}
	
	char get() { // �����, ������� ��������� ������ �� �������
		if(getloc == putloc) { // ���� getloc = putloc, �� ���������, ��� ������� ����� � ������������ �������� 0
			System.out.println(" - ������� �����");
			return (char) 0;
		}
		
		getloc++; // ���� getloc = putloc, �� ����������� ��� ����� ������
		return q[getloc]; // ������������ �������� ���������� ������� � �������� getloc
	}
}

class QDemo { 
	public static void main(String args[]) {
		Queue bigQ = new Queue(100); // �������� ������ ������ Queue
		Queue smallQ = new Queue(4); // �������� ��� ���� ������ ������ Queue
		char ch;
		
		System.out.println("������������� ������� bigQ ��� ���������� ��������");
		for(int i = 0; i < 26; i++) { // ��������� ��������� �������� � ������� bigQ
			bigQ.put((char)  ( 'A' + i));
		}
		System.out.print("���������� ������� bigQ: "); // ���������� ��������� �������� �� ������� bigQ
		for(int i = 0; i < 26; i++) {
			ch = bigQ.get();
			if (ch!= 0) {
				System.out.print(ch);
			}
		}
		System.out.println("\n");
		
		System.out.println("������������� ������� smallQ ��� ��������� ������");
		for(int i = 0; i < 5; i++) {
			System.out.print("������� ���������� " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			System.out.println();
		}
		System.out.println();
		
		System.out.print("���������� smallQ: "); // �������������� ������ ��� ��������� � ������� SmallQ
		for(int i = 0; i < 5; i++) {
			ch = smallQ.get();
			if(ch != (char) 0) System.out.print(ch);
		}
		
		bigQ.put(5);
		bigQ.put(5.2);
		
	}
}