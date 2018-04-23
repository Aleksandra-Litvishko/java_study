package learnUp;

class VarArgs3 {
	static void VaTest(int...v) {
		System.out.println("���������� ����������: " + v.length);
		System.out.println("����������: ");
		for(int i = 0; i < v.length; i++) {
			System.out.println("v[" + i + "]: " + v[i]);
		}
	}
	static void VaTest(boolean...v) {
		System.out.println("���������� ����������: " + v.length);
		System.out.println("����������: ");
		for(int i = 0; i < v.length; i++) {
			System.out.println("v[" + i + "]: " + v[i]);
		}
	}
	static void VaTest(String msg, int...v) {
		System.out.println(msg + v.length);
		System.out.println("����������: ");
		for(int i = 0; i < v.length; i++) {
			System.out.println("v[" + i + "]: " + v[i]);
		}
	}
	public static void main(String args[]) {
		VaTest(true,false,true);
		VaTest(99,345,24,13,2353,576,347 );
		VaTest("������������: ", 2,3,4,9,8); 
	}
}