package learnUp;

class ForEach {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		System.out.print("���������� �������: ");
		for(int x: arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		System.out.print("�����: ");
		for(int y: arr) {
			sum += y;
		}
		System.out.print(sum);
	}
}