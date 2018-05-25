package learnUp;

class ThrowsDemo { // ������������� ��������� ����� throws
	public static char prompt(String a) 
			throws java.io.IOException { // �������� throws � ���������� ������
		
		System.out.println(a + ": ");
		return (char) System.in.read();
	}

	public static void main(String args[]) {
		char ch;
		
try {
	ch = prompt("Enter a letter"); // � ������ prompt() ����� ���� ������������� ����������, ������� ��� ����� ������� ��������� � ���� try 
}
catch(java.io.IOException exc) {
	System.out.println("��������� ���������� �����-������!");
	ch = 'X';
}
System.out.println("�� ������ �������: " + ch);
	}
}