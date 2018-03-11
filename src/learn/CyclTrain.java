package learn;

class CyclTrain {
	public static void main(String args[]) {
		int a,b,s;
		
		a = b = 1;
		
		while(a != 100) {
		for(a = 1, b = 101; ; a++, b++) {
			s = a * b;
		System.out.println("Сторона а: " + a);
		System.out.println("Сторона b: " + b);
		System.out.println("Площадь треугольника: " + s);
		System.out.println("");
		   }	
		}
	}
}