package tasks;
class Help2 {
	public static void main(String args[])
	throws java.io.IOException {
		int choice, ignore;
		
		do {
		System.out.println("�������:");
		System.out.println("1. if");
		System.out.println("2. switch");
		System.out.println("3. for");
		System.out.println("4. while");
		System.out.println("5. do-while");
		System.out.print("��������: ");
		
		choice = (char) System.in.read();
		
		do {
		 ignore = (char) System.in.read();
		} while(ignore != '\n');
		
		System.out.println("\n");
		
		switch (choice) {
		case '1': 
			System.out.println("��������� ��������� if:"); 
			System.out.println("if (�������) ��������;"); 
			System.out.println("else ��������;");
			System.out.println("\n");
			break;
		case '2':
			System.out.println("��������� ��������� switch:"); 
			System.out.println("switch (���������) { ");
			System.out.println("case 'x':" );
			System.out.println("��������;");
			System.out.println("case 'y':");
			System.out.println("��������;");
			System.out.println("...");
			System.out.println("default:");
			System.out.println("��������;");
			System.out.println("}");
			System.out.println("\n");
			break;
		case '3':
			System.out.println("��������� ��������� for"); 
			System.out.println("for(�������������; �������; ��������)");
			System.out.println("��������;" );
			System.out.println("\n");
			break;
		case '4':
			System.out.println("��������� ��������� while"); 
			System.out.println("while(�������) ��������;");
			System.out.println("\n");
			break;
		case '5':
			System.out.println("��������� ��������� do-while"); 
			System.out.println("do {");
			System.out.println("��������;");
			System.out.println("} while(�������);");
			System.out.println("\n");
			break;
		default: System.out.println("��������� �����.");
		      }
		   } while(choice != '1');
		}
	}