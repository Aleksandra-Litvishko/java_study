package learn;
class If_Els_Full_Inside {
	public static void main(String args[]) 
	throws java.io.IOException {
		char ch, secret = 'q';
		
		System.out.println("�������� ����� � ��������� A-Z");
		System.out.println("���������� ������� �: ");
		
		    ch = (char) System.in.read();
		if(ch == secret) System.out.println("***���������!***");
		else { System.out.println("...���������� ��� ���");
			if (ch < secret) {
			System.out.println("���������: ���������� ����� ������������� ����� � ����� ��������");
			}
			else {
			System.out.println("���������: ���������� ����� ������������� ����� � ������ ��������");
		   }
		}
	}
}