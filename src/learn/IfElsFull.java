package learn;
class IfElsFull {
	public static void main(String args[])
	throws java.io.IOException {
		char secr, ch;
		int counter;
		
		System.out.println("�������� ����� �� ��������� A-Z");
		System.out.print("���������� � �������: ");
		for(counter = 1; counter < 100; counter++) {
			secr = 'f';
				ch = (char) System.in.read();

				if (ch == secr) { 
					System.out.println("***���������!***");
					break;
				}
				else {
					System.out.println("...���������� ��� ���");
				}
				
			}
	} 
}