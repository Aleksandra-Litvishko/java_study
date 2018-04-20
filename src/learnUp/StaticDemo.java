package learnUp;

class StaticD { // статическа€ переменна€ в действии
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
		
		System.out.println("ѕеременные ob.x и ob1.x независимы:" +"\n" + "ob.x: " + ob.x + "\n" + "ob1.x: " +ob1.x);
		StaticD.y = 15;
		
		System.out.println("—татическа€ переменна€ y - обща€: " + StaticD.y);
		System.out.println("ob.sum(): " + ob.sum());
		System.out.println("ob1.sum(): " + ob1.sum());
		
		System.out.println("ћен€ем значение статической переменной y на 25");
		StaticD.y = 25;
		
		System.out.println("ob.sum(): " + ob.sum());
		System.out.println("ob1.sum(): " + ob1.sum());
	}
}