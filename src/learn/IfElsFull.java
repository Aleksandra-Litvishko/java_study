package learn;
class IfElsFull {
	public static void main(String args[]){
		char secr, ch;
		int counter;
		
		System.out.println("Загадана буква из диапазона A-Z");
		System.out.print("Попробуйте её угадать: ");
		while(true) {
			secr = 'f';
			try {
				ch = (char) System.in.read();

				if (ch == secr) { 
					System.out.println("***Правильно!***");
					break;
				}
				else {
					System.out.println("...Попробуйте ещё раз");
				}
				
			}
			
		
			catch(Throwable s) {
			}
	} 
}
	}