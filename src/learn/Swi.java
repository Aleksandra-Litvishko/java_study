package learn;

class Swi {
	public static void main(String args[]) {
		int i;
		
		for(i = 0; i < 6; i++)
			switch(i) {
			case 1:
				System.out.println("�������� i: " + i);
				break;
			case 2:
				System.out.println("�������� i: " + i);
				break;
			case 3:
				System.out.println("�������� i: " + i);	
				break;
			case 4:
				System.out.println("�������� i: " + i);
				break;
			default:
				System.out.println("�������� i ������� �� �������� 1-4");
			}
	}
}