package learnUp;

class Test1 {
	int a;
	int b;
	
	Test1(int i, int j) {
		a = i;
		b = j;
	}
	
	void Change(Test1 ob) {
		ob.a = ob.a + ob.b;
		ob.b = - ob.b;
	}
}

class CallByRef {
	public static void main(String args[]) {
		Test1 ob1 = new Test1(15, 20);
		
		System.out.println("�������� ���������� ob1.a � ob1.b �� ������ ������: " + ob1.a + " " + ob1.b);
		
		ob1.Change(ob1);
		
		System.out.println("�������� ���������� ob1.a � ob1.b ����� ������ ������: " + ob1.a + " " + ob1.b);
	}
}