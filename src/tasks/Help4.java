package tasks;
class Help4 {
	public static void main(String args[])
	throws java.io.IOException {
		int choice, ignore;
		
		for( ; ;) { 
			do {
		System.out.println("—правка:");
		System.out.println("1. if");
		System.out.println("2. switch");
		System.out.println("3. for");
		System.out.println("4. while");
		System.out.println("5. do-while");
		System.out.println("6. break");
		System.out.println("7. continue\n");
		System.out.print("¬ыберите (q - выход): ");
		
		choice = (char) System.in.read();
		
		do {
		 ignore = (char) System.in.read();
		} while(ignore != '\n');
		} while  (choice < '1' | choice > '7' & choice !='q');
		
		if(choice == 'q') break;

		System.out.println("\n");
		
		switch(choice) {
		case '1': { 
			System.out.println("—труктура оператора if:\n"); 
			System.out.println("if (условие) оператор;"); 
			System.out.println("else оператор;");
			break;
		}
		case '2': {
			System.out.println("—труктура оператора switch:\n"); 
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
			}
		case '3': {
			System.out.println("—труктура оператора for\n"); 
			System.out.println("for(инициализаци€; условие; итераци€)");
			System.out.println("оператор;" );
			break;
		    }
		case '4': {
			System.out.println("—труктура оператора while\n"); 
			System.out.println("while(условие) оператор;");
			break;
		    }
		case '5': {
			System.out.println("—труктура оператора do-while\n"); 
			System.out.println("do {");
			System.out.println("оператор;");
			System.out.println("} while(условие);");
			break;
		    }
		case '6': {
			System.out.println("—труктура оператора break\n");
			System.out.println("break; или break метка;");
			break;
		    }
		case '7': {
			System.out.println("—труктура оператора continue\n");
			System.out.println("continue; или continue метка;");
			break;
		    }
		}
		 System.out.println();
		  }
		}
	}