package learnUp;

class ExcTest { // ���������� ����� ���� ������������� ����� �������, � ����������� ������

	static void genException() {
		int[] nums = new int[4];

		System.out.println("�� ��������� ����������");

		nums[7] = 10;
		System.out.println("��� ������ �� ����� ������������");
	}
}

class ExcDemo2 {
	public static void main(String args[]) {

		try {
			ExcTest.genException();
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("����� �� ������� �������!");
		}
	}
}