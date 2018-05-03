package learnUp;

class A7 {
	int a;
	
	A7 (int i) {
		a = i;
	}
}

class B7 extends A7 {
	int b;
	
	B7 (int i, int j) {
		super(i);
		b = j;
	}
}

class SuperSubRef7 {
	public static void main(String args[]) {
		A7 a = new A7(9);
		A7 a2;
		B7 b = new B7(3, 5);
		
		a2 = a;
		System.out.println("a2.a и a.a" + " " +a2.a + " "+ a.a);
		
		a2 = b;
		System.out.println("a2.a и b.a" + " " +a2.a + " "+ b.a);
		
		a2.a = 19;
		// a2.b = 20; ошибка компил€ции, т.к. переменна€ b не €вл€етс€ членом класса A7
	}
}