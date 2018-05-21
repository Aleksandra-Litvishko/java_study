package learnUp;

class ExcTest { // исключение может быть сгенерировано одним методом, а перехвачено другим

	static void genException() {
		int[] nums = new int[4];

		System.out.println("До генерации исключения");

		nums[7] = 10;
		System.out.println("Эта строка не будет отображаться");
	}
}

class ExcDemo2 {
	public static void main(String args[]) {

		try {
			ExcTest.genException();
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Выход за границы массива!");
		}
	}
}