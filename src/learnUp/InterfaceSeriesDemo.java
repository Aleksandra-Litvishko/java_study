package learnUp;

interface Series { // ���������� ����������
	int getNext();
	void reset();
	void setStart(int x);
}

class ByThrees implements Series {
	int start;
	int val;
	
	ByThrees() {
		start = 0;
		val = 0;
	}
	
	public int getNext() {
		val += 3;
		return val;
	}
	
	public void reset() {
		start = 0;
		val = 0;
	}
	
	public void setStart(int x) {
		val = x;
		start = x;
	}
}

class ByTwos implements Series { // ���������� ���������� Series
	private int val;
	private int prev; // �����, ����������� ���������, ����� ��������� �������������� ����������
	
	ByTwos() {
		val = 0;
		prev = -2;
	}

	public int getNext() {
		prev = val;
		val += 2;
		return val;
	}
	
	public void reset() {
		val = 0;
		prev = -2;
	}
	
	public void setStart(int x) {
		val = x;
		prev = x - 2;
	}
	
	int getPrevious() { // �����, ����������� ���������, ����� ��������� �������������� ������ 
		return prev;
	}
}

class InterfaceSeriesDemo {
	public static void main(String args[]) {
		ByTwos ob = new ByTwos();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("��������� ��������: " + ob.getNext());
		}
		
		System.out.println("\n�����");
		ob.reset();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("��������� ��������: " + ob.getNext());
		}
		
		System.out.println("\n��������� ��������: 100");
		ob.setStart(100);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("��������� ��������: " + ob.getNext());
		}
	}
}