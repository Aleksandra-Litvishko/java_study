package learn;
class IfEls {
	public static void main(String args[])
	throws java.io.IOException {
		char ch, secr = 's';
		
		System.out.println("�������� ����� �� ��������� A-Z");
		System.out.print("���������� � �������: ");
		ch = (char) System.in.read();
		if(ch == secr)
			System.out.println("***���������!***");
	}
}