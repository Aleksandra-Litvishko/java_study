package learnUp;

class ExcDemo5 { // � ���������� catch ���������� ��������� ������ �������������� �����������
					// �����������
	public static void main(String args[]) {
		int numer[] = { 2, 4, 12, 24, 3, 7, 13, 144, 97 };
		int denom[] = { 1, 2, 0, 6, 0, 7 };

		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
			} catch (ArrayIndexOutOfBoundsException exc) { // �������� ���������� ���������
				System.out.println("��������������� ������� �� ������!");
			} catch (Throwable exc) { // �������� ���������� �����������
				System.out.println("�������� ����������");
			}
		}
	}
}