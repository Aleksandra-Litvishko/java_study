package learnUp;

class Summation {
	int sum;
	
	Summation(int num) {
		sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += i;
		}
	}
	
	Summation(Summation ob) {
		sum = ob.sum;
	}
}

class SumDemo {
	public static void main(String args[]) {
		Summation ob1 = new Summation(5);
		Summation ob2 = new Summation(ob1);
		
		System.out.println("ob1.sum: " + ob1.sum);
		System.out.println("ob2.sum: " + ob2.sum);
	}
}