package learnUp;

class Queue1 {  // �����, ����������� ������� ��� �������� ��������
	char q[]; // ������ ��� �������� ��������� �������
	int a[];
	double d[]; 
	int putloc, getloc; // ������� ��� ������� � ���������� ��������� �������
	
	Queue1 (int size) { // ����������� ������
		q = new char[size + 1]; // ���������� ������ ��� ������� (��� �������)
		a = new int[size + 1];
		d = new double[size + 1];
		
		putloc = getloc = 0; // ������������� ����������, ������� ����� ��������� ���� �������� ��� ������� � ���������� ������
	}
	
	void put(char ch, int i, double j) { // �����, �������� ��������� ��������
		if(putloc == q.length-1) { // ���� putloc = ������ ������� - 1, �� ���������, ��� ������� ��������� � ���������� ������� �� ������ ���������� return
			System.out.println(" - ������� ���������");
			return;
		}
		
		putloc++; // ���� putloc < ������� ������� - 1, �� ����������� ��� ����� ������
		if((i == 0) & (j == 0) | (ch != 0)) {
		    q[putloc] = ch; // ��������, ������������ ������ �������������� ���������� ������� � �������� putloc;
		    }
		if((i != 0) & (ch == 0) | (j == 0)) {
			a[putloc] = i;
			}
		if((ch == 0) & (i == 0) | (j != 0)) {
	        d[putloc] = j;
	        }
	    
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

class QDemoChangeType { 
	public static void main(String args[]) {
		Queue1 bigQ = new Queue1(100); // �������� ������ ������ Queue
		Queue1 smallQ = new Queue1(4); // �������� ��� ���� ������ ������ Queue
		char ch;
		
		System.out.println("������������� ������� bigQ ��� ���������� ��������");
		for(int i = 0; i < 26; i++) { // ��������� ��������� �������� � ������� bigQ
			bigQ.put('0', 8 + i, 0);
		}
		System.out.println("������ ���� ");
		
		for(int i = 0; i < bigQ.a.length; i++ ) {
			System.out.print(bigQ.a[i] +" "); 
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
			smallQ.put((char) ('Z' - i), 0 , 0);
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