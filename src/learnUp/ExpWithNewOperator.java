package learnUp;

class ExpWith {
	
	void sq (int s) {
		
		int result = s % 2 == 0 ? (int) Math.sqrt(s) : 0;
		if(s % 2 == 0) System.out.println(result);
	}
}

class ExpWithNewOperator {
	public static void main(String args[]) {
		ExpWith obj = new ExpWith();
		int x = 5;
		
		obj.sq(x > 6 ? 4: 16);
		
		if(x == 5 ? true: false) {
			System.out.println(x);
		}
	}
}