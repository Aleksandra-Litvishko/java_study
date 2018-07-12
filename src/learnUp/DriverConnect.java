package learnUp;

class DriverConnect {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Успешно!"); // Success.
		} catch (ClassNotFoundException e) {
			System.out.println("Я упал");// Fail.
		}
	}
}