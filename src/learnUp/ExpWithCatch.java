package learnUp;

class ExpWithCatch {
	public static void main(String args[]) {
		try {
			System.out.println("������ try");
			throw new NullPointerException("demo");
		} catch (NullPointerException exc) {
			//System.out.println("������ �atch");
			throw new NullPointerException("demo");
		} finally {
			//System.out.println("������ finally");
		}
	}
}