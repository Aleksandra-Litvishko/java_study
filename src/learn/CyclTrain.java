package learn;

class CyclTrain {
	public static void main(String args[]) {
		int a,b,s;
		
		a = b = 1;
		
		while(a != 100) {
		for(a = 1, b = 101; ; a++, b++) {
			s = a * b;
		System.out.println("������� �: " + a);
		System.out.println("������� b: " + b);
		System.out.println("������� ������������: " + s);
		System.out.println("");
		   }	
		}
	}
}