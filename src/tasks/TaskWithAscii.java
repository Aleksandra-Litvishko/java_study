package tasks;

class TaskWithAscii {
	public static void main(String args[]) 
	throws java.io.IOException {
		int k = 0;
		char ch;
		
		System.out.println("������� ����� ��������, ��� ������� ���������� �������� �������: ");
		System.out.println("(��� ������ ������� '.')");
		
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
			
		 System.out.println("\n����� ��������, ��� ������� ��� ������ �������: " + k);
		} while (ch != '.');
	}
}