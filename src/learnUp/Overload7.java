package learnUp;

class A5 { //���������� ������
	private int i, j;
	
	A5 (int a, int b) {
		i = a;
		j = b;
	}
	
	void show() {
		System.out.println("i � j: " + i + " " + j);
	}
}
 
class B5 extends A5 {
	private int k;
	
	B5 (int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	void show(String msg) { //��������� ������� ������ � ������ show() �� ������ A5 ����������, ������� ������ ��������������� ���������� ���������� ������ 
		System.out.println(msg + k);
	}
}

class Overload7 {
	public static void main(String args[]) {
		B5 ob = new B5(1, 6, 8);
		ob.show(); // ����� ������ show �� ����������� �5
		ob.show("������! "); // ����� ������ �� ��������� B5
	}
}