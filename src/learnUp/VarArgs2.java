package learnUp;

class VarArgs2 {
	static void VaTest(String msg, int...v) {
		System.out.println(msg + v.length);
		System.out.println("����������: ");
		for(int i = 0; i < v.length; i++) {
			System.out.println("v[" + i + "]: " + v[i]);
		}
	}
	public static void main(String args[]) {
		VaTest("���� �������� � �������: ", 8);
		VaTest("���� ���������� � �������: ", 2,3,4,9,8);
		VaTest("���� ���������� � �������: "); 
	}
}