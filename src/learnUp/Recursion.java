package learnUp;

class Factorial { // расчёт факториала посредством рекурсивного метода
	
	int factR (int n) {
		int result;
		
		if(n == 1) return 1;
		
		result = factR(n - 1) * n;
		System.out.println(result);
		return result;
	}
	
	int factI (int n) {
		int result = 1;
		
		if(n == 1) return result;
		
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
class Recursion {
	public static void main(String args[]) {
		Factorial f = new Factorial();
		
		System.out.println("Факториал числа 1 рекурсивным методом: " + f.factR(1));
		System.out.println("Факториал числа 5 рекурсивным методом: " + f.factR(5));
		System.out.println("Факториал числа 9 рекурсивным методом: " + f.factR(9));
		
		System.out.println("\nФакториал числа 1 итерационным методом: " + f.factI(1));
		System.out.println("Факториал числа 5 итерационным методом: " + f.factI(5));
		System.out.println("Факториал числа 9 итерационным методом: " + f.factI(9));
	}
}