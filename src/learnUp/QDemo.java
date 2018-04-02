package learnUp;

class Queue {  // �����, ����������� ������� ��� �������� ��������
	char q[]; // ������ ��� �������� ��������� �������
	int putloc, getloc; // ������� ��� ������� � ���������� ��������� �������
	
	Queue (int size) { // ����������� ������
		q = new char[size + 1]; // ���������� ������ ��� ������� (��� �������)
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
			bigQ.put((char)  ('A' + i));
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
	}
}