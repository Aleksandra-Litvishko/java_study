package learnUp;

class Overload{
	void OvlDemo() { // ����� OvlDemo ������������� ��������� 
		System.out.println("��� ����������");
	}
	
	void OvlDemo(int i) {
		System.out.println("� ����� ����������: " + i);
	}
	
	int OvlDemo(int i, int j) {
		System.out.println("� ����� �����������: " + i + " " + j);
		return i + j;
	}
	double OvlDemo(double i, double j) {
		System.out.println("� ����� ����������� ���� double: " + i + " " + j);
		return i + j;
	}
}

class OverloadDemo {
	public static void main(String args[]) {
	Overload od = new Overload();
	int i;
	double j;
	
	od.OvlDemo();
	System.out.println();
	
	od.OvlDemo(1);
	System.out.println();
	
	i = od.OvlDemo(3, 4);
	System.out.println("��������� ������ od.OvlDemo(3, 4): " + i);
	
	System.out.println();
	
	j = od.OvlDemo(3.1, 3.3);
	System.out.println("��������� ������ od.OvlDemo(3.1, 3.3): " + j);
	}
}