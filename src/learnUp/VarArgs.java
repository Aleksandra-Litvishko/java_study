package learnUp;

class VarArgs {
	static void VaTest(int...v) {
		System.out.println("Количество аргументов: " + v.length);
		System.out.println("Содержимое: ");
		for(int i = 0; i < v.length; i++) {
			System.out.println("v[" + i + "]: " + v[i]);
		}
	}
	public static void main(String args[]) {
		VaTest();
		VaTest(0,3,19);
		VaTest(0,3,12,135,46);
	}
}