package learn;

class Guess4 {
	public static void main(String args[])
	throws java.io.IOException {
		char ch, x, ignore;
		
		 x = ignore = 'g';
		
		do {
	System.out.println("Загадана буква в диапазоне a-z.");
	System.out.println("Попытайтесь её угадать: ");
		ch = (char) System.in.read();
		do {
		  ignore = (char) System.in.read();
		} while (ignore != '\n');
		if(ch == x) System.out.println("***Правильно!***");
		else { if (ch > x) {
			System.out.println("...Извините, загаданная буква находится ближе к началу алфавита");
			System.out.println("Повторите попытку!\n");	
			  }
		else { 
			System.out.println("...Извините, загаданная буква находится ближе к концу алфавита");
			System.out.println("Повторите попытку!\n");
			    }
		}
		    } while(ch != x);
	  }
}