package learnUp;

class StaticBlock { // ����������� ���� � ��������
	static double root2;
	static double root3;
	
	static {
		System.out.println("������ ������������ �����");
		root2 = Math.sqrt(2.0);
		root3 = Math.sqrt(3.0);
	}
	
	StaticBlock(String msg) {
		System.out.println(msg);
	}
}

class StaticDemo3 {
	public static void main(String args[]) {
		StaticBlock ob = new StaticBlock("������ ������������");
		
		System.out.println("������ ���������� �� ���� �����: " + StaticBlock.root2);
		System.out.println("������ ���������� �� ��� �����: " + StaticBlock.root3);
		System.out.println(ob); // ��� �� ����� ��� ������ ���������, �� ��� ����� ���������� ����� ������������ ��������������� ����
	}
}