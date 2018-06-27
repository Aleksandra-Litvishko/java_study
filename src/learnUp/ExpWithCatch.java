package learnUp;

class ExpWithCatch {
	public static void main(String args[]) {
		try {
			System.out.println("Внутри try");
			throw new NullPointerException("demo");
		} catch (NullPointerException exc) {
			//System.out.println("Внутри сatch");
			throw new NullPointerException("demo");
		} finally {
			//System.out.println("Внутри finally");
		}
	}
}