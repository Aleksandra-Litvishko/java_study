package learn;

class ForDemo {
	public static void main(String args[]) {
		int count;
		int c = 0;
		for (count = 0; count < 5; count++)
			System.out.println("Значение счётчика: " + ++c);

		System.out.println("Готово!");
	}
}