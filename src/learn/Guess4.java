package learn;

class Guess4 {
	public static void main(String args[])
	throws java.io.IOException {
		char ch, x, ignore;
		
		 x = ignore = 'g';
		
		do {
	System.out.println("�������� ����� � ��������� a-z.");
	System.out.println("����������� � �������: ");
		ch = (char) System.in.read();
		do {
		  ignore = (char) System.in.read();
		} while (ignore != '\n');
		if(ch == x) System.out.println("***���������!***");
		else { if (ch > x) {
			System.out.println("...��������, ���������� ����� ��������� ����� � ������ ��������");
			System.out.println("��������� �������!\n");	
			  }
		else { 
			System.out.println("...��������, ���������� ����� ��������� ����� � ����� ��������");
			System.out.println("��������� �������!\n");
			    }
		}
		    } while(ch != x);
	  }
}