package learnUp;

interface MyIf {
	int getUserID(); // "������� �����" ���������� ��� ���������� �� ���������

	default int getAdminID() { // �����, �� ���������, ���������� ��� ����������
		return 1;
	}

	static int getUniversalID() { // ����������� ����� ����������
		return 0;
	}
}

interface MyIf2 extends MyIf {

}

class MyIfImp implements MyIf { // ���������� ���������� MyIf. ���������� �������� ���� getUserID()
	public int getUserID() {
		return 100;
	}
}

class MyIfImp2 implements MyIf { // �������������� ���������� ����� ������� ����������
	public int getUserID() {
		return 100;
	}

	public int getAdminID() { // ��������������� ������ ���������� getAdminID()
		return 42;
	}
}

class DefaultMethodDemo {
	public static void main(String args[]) {
		MyIfImp obj = new MyIfImp();
		MyIfImp2 obj1 = new MyIfImp2();
		int uID = MyIf.getUniversalID(); // ������������� ������������ ������ ����������

		System.out.println(uID);
		System.out.println();

		System.out.println("������������� ������������: " + obj.getUserID());
		System.out.println("������������� ��������������: " + obj.getAdminID()); // ����� ������ ��������, �.�.
																					// ��������������� ��� ���������� ��
																					// ���������
		System.out.println();

		System.out.println("������������� ������������: " + obj1.getUserID());
		System.out.println("������������� ��������������: " + obj1.getAdminID()); // ��������������� ������ ����������
	}
}