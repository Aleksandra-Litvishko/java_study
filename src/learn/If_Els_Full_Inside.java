package learn;
class If_Els_Full_Inside {
	public static void main(String args[]) 
	throws java.io.IOException {
		char ch, secret = 'q';
		
		System.out.println("Загадана буква в интервале A-Z");
		System.out.print("Попробуйте угадать её: ");
		
		    ch = (char) System.in.read();
		if(ch == secret) System.out.println("***Правильно!***");
		else {
			if (ch < secret) {
			System.out.println("Извините, загаданная буква располагается ближе к концу алфавита");
			}
			else {
			System.out.println("Извините, загаданная буква располагается ближе к началу алфавита");
		   }
		}
	}
}