package tasks;
class Help2 {
	public static void main(String args[])
	throws java.io.IOException {
		int choice;
		
		System.out.println("—правка:");
		System.out.println("1. if");
		System.out.println("2. switch");
		System.out.println("3. for");
		System.out.println("4. while");
		System.out.println("5. do-while");
		System.out.print("¬ыберите: ");
		
		choice = (char) System.in.read();
		
		System.out.println("\n");
		
		switch (choice) {
		case '1': 
			System.out.println("—труктура оператора if:"); 
			System.out.println("if (условие) оператор;"); 
			System.out.println("else оператор;");
			break;
		case '2':
			System.out.println("—труктура оператора switch:"); 
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
		case '3':
			System.out.println("—труктура оператора for"); 
			System.out.println("for(инициализаци€; условие; итераци€)");
			System.out.println("оператор;" );
			break;
		case '4':
			System.out.println("—труктура оператора while"); 
			System.out.println("while(условие) оператор;");
			break;
		case '5':
			System.out.println("—труктура оператора do-while"); 
			System.out.println("do {");
			System.out.println("оператор;");
			System.out.println("} while(условие);");
			break;
		    }
		}
	}