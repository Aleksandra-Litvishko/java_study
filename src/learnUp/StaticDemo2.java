package learnUp;

class StaticD2 { // статический метод в действии
	static int val = 156;
	
	static int valDiv2() {
		return val / 2;
	}
}

class StaticDemo2 {
	public static void main(String args[]) {
		
		System.out.println("StaticD2.val: " + StaticD2.val);
		System.out.println("StaticD2.valDiv2(): " + StaticD2.valDiv2());
		
		StaticD2.val = 1024;
		System.out.println("\nStaticD2.val: " + StaticD2.val);
		System.out.println("StaticD2.valDiv2(): " + StaticD2.valDiv2());
	}
}