package tasks;
class Help {
	public static void main(String args[])
	throws java.io.IOException {
		int choice;
		
		System.out.println("Справка:");
		System.out.println("1. if");
		System.out.println("2. switch");
		System.out.print("Выберите: ");
		
		choice = (char) System.in.read();
		
		System.out.println("\n");
		
		switch (choice) {
		case '1': 
			System.out.println("Структура оператора if:\n"); 
			System.out.println("if (условие) оператор;"); 
			System.out.println("else оператор;");
			break;
		case '2':
			System.out.println("Структура оператора switch:\n"); 
			System.out.println("switch (выражение) { ");
			System.out.println("case 'x':" );
			System.out.println("оператор;");
			System.out.println("case 'y':");
			System.out.println("оператор;");
			System.out.println("...");
			System.out.println("default:");
			System.out.println("оператор;");
			System.out.println("}");
			break;
			default: 
			System.out.println("Запрос не найден");
		    }
		}
	}