package learnUp;

class A5 { //перегрузка метода
	private int i, j;
	
	A5 (int a, int b) {
		i = a;
		j = b;
	}
	
	void show() {
		System.out.println("i и j: " + i + " " + j);
	}
}
 
class B5 extends A5 {
	private int k;
	
	B5 (int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	void show(String msg) { //сигнатуры данного метода и метода show() из класса A5 отличаютс€, поэтому вместо переопределени€ происходит перегрузка метода 
		System.out.println(msg + k);
	}
}

class Overload7 {
	public static void main(String args[]) {
		B5 ob = new B5(1, 6, 8);
		ob.show(); // вызов метода show из суперкласса ј5
		ob.show("ѕривет! "); // вызов метода из подкласса B5
	}
}