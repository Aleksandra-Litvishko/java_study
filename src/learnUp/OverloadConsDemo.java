package learnUp;

class MyClass1 {
int x;	

MyClass1() {
	System.out.println("Внутри MyClass().");
	x = 0;
}

MyClass1(int i) {
	System.out.println("Внутри MyClass(int).");
	x = i;
}

MyClass1(double d) {
	System.out.println("Внутри MyClass(double).");
	x = (int) d;
}

MyClass1(int i, int j) {
	System.out.println("Внутри MyClass(int, int).");
	x = i * j;
}
}

class OverloadConsDemo {
	public static void main(String args[]) {
		MyClass1 ob = new MyClass1();
		MyClass1 ob1 = new MyClass1(1);
		MyClass1 ob2 = new MyClass1(1.1);
		MyClass1 ob3 = new MyClass1(1, 3);
		
		System.out.println("ob.x: " + ob.x);
		System.out.println("ob1.x: " + ob1.x);
		System.out.println("ob2.x: " + ob2.x);
		System.out.println("ob3.x: " + ob3.x);
	}
}

