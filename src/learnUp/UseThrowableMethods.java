package learnUp;

class ExcTest1 {
	static void genException() {
		int nums[] = new int[4];
		
		System.out.println("До генерации исключения");
		nums[4] = 7;
		System.out.println("Эта строка не будет отображаться!");
	}
}

class UseThrowableMethods {
	public static void main(String args[]) {
		try {
			ExcTest1.genException();
		}
		catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("Стандартное сообщение об ошибке");
			System.out.println(exc);
			
			System.out.println("Стек вызовов:");
			exc.printStackTrace();
		}
	}
}