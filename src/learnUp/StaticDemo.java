package learnUp;

class StaticD {
	int x;
	static int y;
	
	int sum() {
		return x + y;
	}
}
class StaticDemo {
	public static void main(String args[]) {
		StaticD ob = new StaticD();
		StaticD ob1 = new StaticD();
		
		ob.x = 10;
		ob1.x = 5;
		
		System.out.println("���������� ob.x � ob1.x ����������:" +"\n" + "ob.x: " + ob.x + "\n" + "ob1.x: " +ob1.x);
		StaticD.y = 15;
		
		System.out.println("����������� ���������� y - �����: " + StaticD.y);
		System.out.println("ob.sum(): " + ob.sum());
		System.out.println("ob1.sum(): " + ob1.sum());
		
		System.out.println("������ �������� ����������� ���������� y �� 25");
		StaticD.y = 25;
		
		System.out.println("ob.sum(): " + ob.sum());
		System.out.println("ob1.sum(): " + ob1.sum());
	}
}