package learnUp;

class VarArgs2 {
	static void VaTest(String msg, int...v) {
		System.out.println(msg + v.length);
		System.out.println("Содержимое: ");
		for(int i = 0; i < v.length; i++) {
			System.out.println("v[" + i + "]: " + v[i]);
		}
	}
	public static void main(String args[]) {
		VaTest("Один аргумент в массиве: ", 8);
		VaTest("Пять аргументов в массиве: ", 2,3,4,9,8);
		VaTest("Ноль аргументов в массиве: "); 
	}
}