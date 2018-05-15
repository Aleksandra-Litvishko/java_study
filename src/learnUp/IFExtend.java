package learnUp;

interface A1 { // ������������ �����������
	void meth1();
	void meth2();
}

interface B1 extends A1 { // ��������� ��� �������� ������ meth1() � meth2() (�.�. ��������� B1 ��������� ��������� A1). ����������� ����� meth3()
	void meth3();
}

class MyClasss implements B1 { // ���� ����� ������ ����������� ��� ������, ����������� � ����������� �1 � B1 
	public void meth1() {
		System.out.println("���������� meth1()");
	}
	public void meth2() {
		System.out.println("���������� meth2()");
	}
	public void meth3() {
		System.out.println("���������� meth3()");
	}
}
 
class IFExtend {
	
	public static void main(String args[]) {
		MyClasss ob = new MyClasss();
		
		ob.meth1();
		ob.meth2();
		ob.meth3();
	}
}