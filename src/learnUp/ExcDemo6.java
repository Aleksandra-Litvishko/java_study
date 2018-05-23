package learnUp;

class ExcDemo6 { // использование вложенных блоков try
	public static void main(String args[]) {
		int numer[] = { 2, 4, 12, 24, 3, 7, 13, 144, 97 }; // превышает длину массива denom[]
		int denom[] = { 1, 2, 0, 6, 0, 7 };

		try { // внешний блок try
			for (int i = 0; i < numer.length; i++) {
				try { // внутренний блок try
					System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
				} catch (ArithmeticException exc) { // перехватить исключение
					System.out.println("Деление на ноль!");
				}
			}
		} catch (ArrayIndexOutOfBoundsException exc) { // перехватить исключение
			System.out.println("Соответствующий элемент не найден!");
			System.out.println("Фатальная ошибка - выполнение программы прервано!");
		}
	}
}