package learnUp;

class MultiCatch { // ������������� �������� ���������� ��������� (� JDK7)
	public static void main(String args[]) {
		int a = 88, b = 0;
		int result;
		char chrs[] = { 'A', 'B', 'C' };

		for (int i = 0; i < 2; i++) {
			try {
				if (i == 0) {
					result = a / b;
					System.out.println(result);
				} else {
					chrs[5] = 'X';
				} 
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // � ���� ��������� catch ������������ �������� ����� ����������
				System.out.println("������������� ����������: " + e);
			}
		}
		System.out.println("����� ���������� ����������� ����������");
	}
}