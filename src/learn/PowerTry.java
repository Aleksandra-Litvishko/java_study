package learn;

class PowerTry {
	public static void main(String args[]) {
		int e, i;
		int result = 1;
		
		for(e = 0; e < 10; e++) {
			result *= 2;
			i = e;
			System.out.println("2 в степени " + e + " равно " + result);
		}
	}
}