package li.java.tasks.experiments;

public class SimpleAlgo {
	public int getFactorial(int a) {
		int result;
		
		if(a == 1) return 1;
		
		result = a * (getFactorial(a-1));
		return result;
	}
	
	public static void getFibonacchi() {
		int a = 1;
		int b = 1;
		int fibSum;
		
		for(int i = 0; i < 500; i++) {
			if(a == 1 & b == 1) System.out.print(a + " " + a + " ");
			fibSum = a + b;
			a = b;
			b = fibSum;
			System.out.print(fibSum + " ");
		}	
	}
		
		public static void getMyFibonacchi() {
			int a = 1;
			int b = 1;
			int fibSum;
			
			for(int i = 0; i < 500; i++) {
				fibSum = a + b;
				a = b;
				b = fibSum;
				System.out.print(fibSum + " ");
			}	
	}
}