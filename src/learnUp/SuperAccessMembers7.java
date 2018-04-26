package learnUp; // ������������� ��������� ����� super ��� �������������� �������� ���

class A {
	int i;
}

class B extends A {
	int i; // ��� ���������� i �������� ���������� i �� �����������
	
	B (int a, int b) {
		super.i = a; // i �� �����������
		i = b; // i �� ���������
	}
	
	void show () {
		System.out.println("i � �����������: " + super.i);
		System.out.println("i � ���������: " + i);
	}
}

class SuperAccessMembers7 {
	public static void main(String args[]) {
		B ob = new B(1, 2);
		
		ob.show();
	}
}