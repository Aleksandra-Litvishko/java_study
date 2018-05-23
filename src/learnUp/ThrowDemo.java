package learnUp;

class ThrowDemo { // генерирование исключения вручную
	public static void main(String args[]) {
		try {
			System.out.println("До возникновения исключения");
			throw new ArithmeticException(); // сгенерировать исключение
		} catch (ArithmeticException exc) { // перехватить исключение
			System.out.println("Исключение перехвачено!");
		}
		System.out.println("После блока try/catch");
	}
}