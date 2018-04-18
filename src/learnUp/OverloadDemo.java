package learnUp;

class Overload{
	void OvlDemo() { // метод OvlDemo перегружается четырежды 
		System.out.println("Без параметров");
	}
	
	void OvlDemo(int i) {
		System.out.println("С одним параметром: " + i);
	}
	
	int OvlDemo(int i, int j) {
		System.out.println("С двумя параметрами: " + i + " " + j);
		return i + j;
	}
	double OvlDemo(double i, double j) {
		System.out.println("С двумя параметрами типа double: " + i + " " + j);
		return i + j;
	}
}

class OverloadDemo {
	public static void main(String args[]) {
	Overload od = new Overload();
	int i;
	double j;
	
	od.OvlDemo();
	System.out.println();
	
	od.OvlDemo(1);
	System.out.println();
	
	i = od.OvlDemo(3, 4);
	System.out.println("Результат вызова od.OvlDemo(3, 4): " + i);
	
	System.out.println();
	
	j = od.OvlDemo(3.1, 3.3);
	System.out.println("Результат вызова od.OvlDemo(3.1, 3.3): " + j);
	}
}