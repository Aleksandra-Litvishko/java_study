package learnUp;

class StringArrays {
	public static void main(String args[]) {
		String str[] = {"Ёта", "строка", "€вл€етс€", "тестом."};
		
		for(String x: str) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		str[2] = "также €вл€етс€";
		str[3] = "тестом!";
		
		for(String x: str) {
			System.out.print(x + " ");
		}
	}
}