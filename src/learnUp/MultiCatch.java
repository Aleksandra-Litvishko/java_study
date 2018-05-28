package learnUp;

class MultiCatch { // использование средства группового перехвата (с JDK7)
	public static void main(String args[]) {
		int a = 88, b = 0;
		int result;
		char chrs[] = { 'A', 'B', 'C' };

		for (int i = 0; i < 2; i++) {
			try {
				if (i == 0) {
					result = a / b;
					System.out.println(result);
				} else {
					chrs[5] = 'X';
				} 
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // в этом операторе catch организуется перехват обоих исключений
				System.out.println("Перехваченное исключение: " + e);
			}
		}
		System.out.println("После группового перхватчика исключений");
	}
}