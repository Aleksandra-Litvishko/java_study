package learnUp.tasks;

class QDe { // �����, ����������� ������� ��� �������� ��������;
	char arr[]; // ������ ��� �������� ��������� �������;
	int putloc, getloc; // �������, ��� ������� � ���������� ��������� �������;
	
	QDe(int size) { // ��������������� ������ ������� ��������� �������
		arr = new char[size+1]; // �������� ������ ��� �������
		putloc = getloc = 0;
	}
	
	QDe(QDe ob) { // ��������������� ������� �� ������ ���������� �������
		putloc = ob.putloc;
		getloc = ob.getloc;
		arr = new char[ob.arr.length];
		
		for(int i = getloc + 1; i <= putloc; i++) { // ���������� �������� � �������
			arr[i] = ob.arr[i];
		}
	}
	
	QDe(char a[]) { //��������������� ������� �� ������ ������� �������� ��������
		putloc = 0;
		getloc = 0;
		arr = new char[a.length + 1];
		
		for(int i = 0; i < a.length; i++) {
			put(a[i]);
		}
	}
	
	void put(char ch) { //��������� ������ � �������
		if(putloc == arr.length - 1) {
			System.out.println("\n������� ���������");
			return;
		}
		putloc++;
		arr[putloc] = ch;
	}
	
	char get(int i) { //������� ������ �� �������
		if(getloc == putloc) {
			System.out.println("\n������� �����");
		    return (char) 0;
		}
		getloc++;
		return arr[getloc];
	}
}

class QDemo2 {
	public static void main(String args[]) {
		QDe alph = new QDe(35);
		char q[] = {'a', 'b', 'c', 'd'};
		QDe alph3 = new QDe(q);
	
		char ch;
		
		System.out.println("���������� ������� alph3: ");
		for(int i = 0; i < 4; i++) {
			ch = alph3.get(i);
			System.out.print(ch);
		}
		System.out.println();
		
		for(int i = 0; i < 32; i++) {
			alph.put((char) ('�' + i));
		}
		
		QDe alph1 = new QDe(alph);
		
		System.out.println("���������� ������� alph: ");
		for(int i = 0; i < 32; i++) {
			ch = alph.get(i);
			System.out.print(ch);
		}
		System.out.println();
		
		System.out.println("���������� ������� alph1: ");
		for(int i = 0; i < 32; i++) {
			ch = alph1.get(i);
			System.out.print(ch);
		}
	}
}