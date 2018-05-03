package learnUp;

class A4 { //��������������� ������
	private int i, j;
	
	A4 (int a, int b) {
		i = a;
		j = b;
	}
	
	void show() {
		System.out.println("i � j: " + i + " " + j);
	}
}
 
class B4 extends A4 {
	private int k;
	
	B4 (int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	void show() { // ���� ����� �������������� ����� show() �� ������ �4
		// super.show(); ������������� ��������� ����� super ��� ������ ������ ������ show(), ������������ � ����������� A4
		System.out.println("k: " + k);
	}
}

class Override7 {
	public static void main(String args[]) {
		B4 ob = new B4(1, 6, 8);
		
		ob.show();
	}
}