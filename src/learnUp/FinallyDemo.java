package learnUp;

class UseFinally { // использование блока finally
	public static void genException(int what) {
		int t;
		int demo[] = new int[2];
		try {
			switch (what) {
			case 0:
				t = 10 / what; // сгенерировать ошибку деления на ноль
				System.out.println(t);
			case 1:
				demo[4] = 7; // сгенерировать ошибку обращения к массиву
			case 2:
				return; // возвратиться из блока try
			}
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Выход за границы массива!");
		} catch (ArithmeticException exc) {
			System.out.println("Деление на ноль!");
		} finally { // этот блок выполняется независимо от того, как завершится try/catch
			System.out.println("Выход из блока try!");
		}
	}
}

class FinallyDemo {
	public static void main(String args[]) {
		for (int i = 0; i < 3; i++) {
			UseFinally.genException(i);
			System.out.println();
		}
	}
}