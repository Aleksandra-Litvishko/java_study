package learnUp;

class UseFinally { // ������������� ����� finally
	public static void genException(int what) {
		int t;
		int demo[] = new int[2];
		try {
			switch (what) {
			case 0:
				t = 10 / what; // ������������� ������ ������� �� ����
				System.out.println(t);
			case 1:
				demo[4] = 7; // ������������� ������ ��������� � �������
			case 2:
				return; // ������������ �� ����� try
			}
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("����� �� ������� �������!");
		} catch (ArithmeticException exc) {
			System.out.println("������� �� ����!");
		} finally { // ���� ���� ����������� ���������� �� ����, ��� ���������� try/catch
			System.out.println("����� �� ����� try!");
		}
	}
}

class FinallyDemo {
	public static void main(String args[]) {
		for (int i = 0; i < 3; i++) {
			UseFinally.genException(i);
			System.out.println();
		}
	}
}