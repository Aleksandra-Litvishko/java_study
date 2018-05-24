package learnUp;

class Rethrow { // ��������� ������������� ����������
	public static void genException() {
		int numer[] = { 2, 4, 12, 24, 3, 7, 13, 144, 97 }; // ��������� ����� ������� denom[]
		int denom[] = { 1, 2, 0, 6, 0, 7 };

		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
			} catch (ArithmeticException exc) {
				System.out.println("������� �� ����!");
			} catch (ArrayIndexOutOfBoundsException exc) {
				System.out.println("��������������� ������� �� ������!");
				throw exc; // �������� ������������� ����������;
			}
		}
	}
}

class RethrowDemo1 {
	public static void main(String args[]) {
		try {
			Rethrow.genException();
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("��������� ������! ���������� ��������� ��������!");
		}
	}
}

