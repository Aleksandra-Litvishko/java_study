package learn;
class IfElsFull {
	public static void main(String args[])
	throws java.io.IOException {
		char secr, ch;
		int counter;
		
		System.out.println("Загадана буква из диапазона A-Z");
		System.out.print("Попробуйте её угадать: ");
		for(counter = 1; counter < 100; counter++) {
			secr = 'f';
				ch = (char) System.in.read();

				if (ch == secr) { 
					System.out.println("***Правильно!***");
					break;
				}
				else {
					System.out.println("...Попробуйте ещё раз");
				}
				
			}
	} 
}