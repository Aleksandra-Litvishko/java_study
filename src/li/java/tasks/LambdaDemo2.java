package li.java.tasks;

interface NumericTest {
	boolean test(int n, int m);
}

public class LambdaDemo2 {
	public static void main(String args[]) {
		int a = 10;
		
		NumericTest isFactor = (n, d) -> (n % d) == 0;
		
		NumericTest lessThan = (n, d) -> (n < d + a);
		
		System.out.println("4 является делителем 8: " + isFactor.test(8, 4));
		System.out.println("5 меньше 9: " + lessThan.test(5, 9));
	} 
}