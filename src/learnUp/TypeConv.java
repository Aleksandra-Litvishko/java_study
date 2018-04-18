package learnUp;

class Overload2 {
	void OverLo(byte i) {
		System.out.println("Внутри OverLo(byte): " + i);
	}
	
	void OverLo(int i) {
		System.out.println("Внутри OverLo(int): " + i);
	}
	
	void OverLo(double i) {
		System.out.println("Внутри OverLo(double): " + i);
	}
}

class TypeConv {
	public static void main(String args[]) {
		Overload2 ol2 = new Overload2();
		
		int i = 10;
		double d = 3.5;
		byte b = 8;
		short s = 15;
		float f = 13.5F;
		
		ol2.OverLo(i);
		ol2.OverLo(d);
		ol2.OverLo(b);
		ol2.OverLo(s);
		ol2.OverLo(f);
	}
}