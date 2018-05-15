package learnUp;

abstract class A2 {

	static int a = 3;

	public static int get() {
		return a;
	}
}

class B2 extends A2 {
	static int b = 4;

	public static int get() {
		return b;
	}
}

class newtask {
	public static void main(String args[]) {
		System.out.println(B2.get());
		System.out.println(A2.get());
	}
}