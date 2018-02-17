package realApp;

public class realApp {

	public static void main(String[] args) {

		// Static Method of Calc class
		int result = Calc.sumStatic(1, 2);
		System.out.println(result);
		
		// Method of instance of Calc class
		Calc test = new Calc();
		result = test.sum(1, 2);
		System.out.println(result);
		
	}

}
