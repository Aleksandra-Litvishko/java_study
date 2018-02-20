package learn;

class If_Else_If {
	public static void main(String args[]) {
		int i;
		
		for(i = 0; i < 6; i++) {
			if(i == 1) System.out.println("i равно " + i);
			else if(i == 2) System.out.println("i равно " + i);
			else if(i == 3) System.out.println("i равно " + i);
			else if(i == 4) System.out.println("i равно " + i);
			else System.out.println("Значение i находится вне дипазона 1-4");
		}
	}
} 