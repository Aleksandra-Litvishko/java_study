package learnUp;

class NonIntResultException extends Throwable { // использование специально создаваемого исключения
	int n, d;

	 NonIntResultException(Exception ex) {
		 super(ex);
	 }

	NonIntResultException(int i, int j) {
		n = i;
		d = j;
	}

	// public String toString() {
	// return "результат операции " + n + " / " + d + " не является целым числом!";
	// }
}

class CustomExceptDemo {
	public static void main(String args[]) throws NonIntResultException {

		int numer[] = { 4, 8, 15, 32, 64, 127, 256, 512 };
		int denom[] = { 2, 2, 0, 4, 0, 8 };

		for (int i = 0; i < numer.length; i++) {

			try {
				if (numer[i] % 2 != 0) {
					throw new NonIntResultException(numer[i], denom[i]);
				}
				System.out.println("numer[i]" + " / " + "denom[i]" + " = " + numer[i] / denom[i]);
			} 
			catch (ArithmeticException exc) {
				// NonIntResultException e = new NonIntResultException(exc);
				try {
				throw new NonIntResultException(exc);
				} 
				catch(NonIntResultException exc1) {
					System.out.println("Hey"); 
					}
				// new ArrayIndexOutOfBoundsException(exc);
				
				//System.out.println("1: " + e.getCause());
			}
			catch (ArrayIndexOutOfBoundsException exc) {
				System.out.println("Соответствущий элемент не найден!");
				exc.getCause();
			}
			catch (NonIntResultException exc) {
				//System.out.println("Hey");
				System.out.println("2: " + exc);
				// System.out.println(exc.getCause());
			}

		}
	}
}