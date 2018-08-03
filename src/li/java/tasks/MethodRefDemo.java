package li.java.tasks;

interface IntPredicate {
	boolean test(int i);
}

class MyIntPredicates { // определяет 3 статических метода, которые проверяют соответствие целого числа определённым условиям
	static boolean isPrime(int n) { // возвращает true, если заданное число простое
		if(n < 2) return false;
		
		for(int i = 2; i <= n/i; i++) {
			if((n % i) == 0) return false;
		}
		return true;
	}
	
	static boolean isEvent(int n) { // возвращает true, если число чётное
		return (n % 2) == 0;
	}
	
	static boolean isPositive(int n) { // true, если число положительное
		return n > 0;
	}
}

class MethodRefDemo {
	static boolean numTest(IntPredicate p, int v) {
		return p.test(v);
	}
	
	public static void main(String args[]) {
		boolean result;
		
		result = numTest(MyIntPredicates::isPrime, 17);
		if(result) System.out.println();
	}
}