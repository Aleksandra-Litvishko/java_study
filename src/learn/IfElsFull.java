package learn;
class IfElsFull {
	public static void main(String args[]){
		char secr, ch;
		int counter;
		
		System.out.println("�������� ����� �� ��������� A-Z");
		System.out.print("���������� � �������: ");
		while(true) {
			secr = 'f';
			try {
				ch = (char) System.in.read();

				if (ch == secr) { 
					System.out.println("***���������!***");
					break;
				}
				else {
					System.out.println("...���������� ��� ���");
				}
				
			}
			
		
			catch(Throwable s) {
			}
	} 
}
	}