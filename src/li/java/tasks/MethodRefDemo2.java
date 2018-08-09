package li.java.tasks;

interface IntPredicateNew {
	boolean test(int n);
}

class MyIntNum {
	private int v;
	
	MyIntNum(int x) {
		v = x;
	}
	
	int getNum() {
		return v;
	}
	
	boolean isFactor (int n) {
		return ((v % n) == 0);
	}
	
	boolean hasCommonFactor(int n) {
		int a;
		if (n < v) a = n;
		else a = v;
		
		for(int i = 2; i <= a/2; i++) {
			if(((n % i) == 0) && ((v % i) == 0)) {
			return true; 
			}
		}
		return false;
	}
}

class MethodRefDemo2 {
	public static void main(String args[]) {
		boolean result;
		
		MyIntNum myNum1 = new MyIntNum(12);
		MyIntNum myNum2 = new MyIntNum(29);
		
		IntPredicateNew ip = myNum1::isFactor;
		
		result = ip.test(3);
		
		if(result) {
			System.out.println("3 является делителем " + myNum1.getNum());
			}
		
		ip = myNum2::isFactor;
		
		result = ip.test(3);
		
		if(!result) System.out.println("3 не является делителем " + myNum2.getNum());
		
		ip = myNum2::hasCommonFactor;
		
		result = ip.test(4);
		
		if(result) System.out.println("4 имеет общий делитель с " + myNum2.getNum());
	}	
}