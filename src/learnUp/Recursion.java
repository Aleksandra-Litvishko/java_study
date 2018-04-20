package learnUp;

class Factorial { // ������ ���������� ����������� ������������ ������
	
	int factR (int n) {
		int result;
		
		if(n == 1) return 1;
		
		result = factR(n - 1) * n;
		System.out.println(result);
		return result;
	}
	
	int factI (int n) {
		int result = 1;
		
		if(n == 1) return result;
		
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
class Recursion {
	public static void main(String args[]) {
		Factorial f = new Factorial();
		
		System.out.println("��������� ����� 1 ����������� �������: " + f.factR(1));
		System.out.println("��������� ����� 5 ����������� �������: " + f.factR(5));
		System.out.println("��������� ����� 9 ����������� �������: " + f.factR(9));
		
		System.out.println("\n��������� ����� 1 ������������ �������: " + f.factI(1));
		System.out.println("��������� ����� 5 ������������ �������: " + f.factI(5));
		System.out.println("��������� ����� 9 ������������ �������: " + f.factI(9));
	}
}