package learn;

class UnderstandHelp4 {
	public static void main(String args[])
	throws java.io.IOException {
		char ignore, choice;
		do {
			System.out.println("Справка:");
			System.out.println("1. if");
			System.out.println("2. switch");
			System.out.println("3. for");
			System.out.println("4. while");
			System.out.println("5. do-while");
			System.out.println("6. break");
			System.out.println("7. continue\n");
			System.out.print("Выберите (q - выход): ");
			
			choice = (char) System.in.read();
			
			do {
			 ignore = (char) System.in.read();
			} while (ignore != '\n');
			} while (choice < '1' | choice > '7' & choice !='q');
		System.out.println("Был выполнен выход из цикла do-while");
	}
}