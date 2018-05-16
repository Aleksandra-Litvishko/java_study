package learnUp;

class A2 {

	int a = 3;

	public int get() {
		return a;
	}
}

class B2 extends A2 {
	int b = 4;
	int arr [] = {1, 2, 3, 4};

	public int get() {
		return b;
	}
	
	public void ret() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
}
}

class newtask {
	public static void main(String args[]) {
		B2 ob_b = new B2();
		A2 ob_a = new A2();
		
		ob_b.ret();
		
		System.out.println(ob_b.get());
		System.out.println(ob_b.get());
		
		System.out.println(ob_a.get());
		System.out.println(ob_a.get());
	}
}