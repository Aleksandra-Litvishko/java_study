package learn;

class Break5 {
	public static void main(String args[]) {
		done: 
			for(int i = 1; i < 10; i++) {
				for(int j = 1; j < 10; j++) {
					for(int k = 1; k < 10; k++) {
						System.out.println("�������� k: " + k);
						if(k == 5) break done;
					}
					System.out.println("����� ����� �� k");
				}
				System.out.println("����� ����� �� j");
			}
	System.out.println("����� ����� �� i");
	}
}