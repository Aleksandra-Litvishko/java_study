package tasks;

class TaskWithAscii {
	public static void main(String args[]) 
	throws java.io.IOException {
		int k = 0;
		char ch;
		
		System.out.println("Введите букву алфавита, для которой необходимо изменить регистр: ");
		System.out.println("(Для выхода нажмите '.')");
		
		do {
			ch = (char) System.in.read();
			
			if(ch >= 'a' & ch <= 'z') {
				 ch -= 32;  
				 k++;
				 System.out.println(ch);
			    }
			
			else if(ch >= 'A' & ch <= 'Z') { 
				 ch += 32; 
				 k++;
				 System.out.println(ch);
				}
			
		 System.out.println("\nЧисло символов, для которых был изменён регистр: " + k);
		} while (ch != '.');
	}
}