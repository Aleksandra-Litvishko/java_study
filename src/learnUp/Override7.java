package learnUp;

class A4 { //переопределение метода
	private int i, j;
	
	A4 (int a, int b) {
		i = a;
		j = b;
	}
	
	void show() {
		System.out.println("i и j: " + i + " " + j);
	}
}
 
class B4 extends A4 {
	private int k;
	
	B4 (int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	void show() { // этот метод переопредел€ет метод show() из класса ј4
		// super.show(); использование ключевого слова super дл€ вызова версии метода show(), определЄнного в суперклассе A4
		System.out.println("k: " + k);
	}
}

class Override7 {
	public static void main(String args[]) {
		B4 ob = new B4(1, 6, 8);
		
		ob.show();
	}
}