package learnUp;

class DriverConnect {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("�������!"); // Success.
		} catch (ClassNotFoundException e) {
			System.out.println("� ����");// Fail.
		}
	}
}