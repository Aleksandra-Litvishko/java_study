package learnUp;

class StringArrays {
	public static void main(String args[]) {
		String str[] = {"���", "������", "��������", "������."};
		
		for(String x: str) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		str[2] = "����� ��������";
		str[3] = "������!";
		
		for(String x: str) {
			System.out.print(x + " ");
		}
	}
}