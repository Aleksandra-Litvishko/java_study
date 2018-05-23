package learnUp;

class ExcDemo6 { // ������������� ��������� ������ try
	public static void main(String args[]) {
		int numer[] = { 2, 4, 12, 24, 3, 7, 13, 144, 97 }; // ��������� ����� ������� denom[]
		int denom[] = { 1, 2, 0, 6, 0, 7 };

		try { // ������� ���� try
			for (int i = 0; i < numer.length; i++) {
				try { // ���������� ���� try
					System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
				} catch (ArithmeticException exc) { // ����������� ����������
					System.out.println("������� �� ����!");
				}
			}
		} catch (ArrayIndexOutOfBoundsException exc) { // ����������� ����������
			System.out.println("��������������� ������� �� ������!");
			System.out.println("��������� ������ - ���������� ��������� ��������!");
		}
	}
}