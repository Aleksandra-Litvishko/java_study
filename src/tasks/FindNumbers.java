package tasks;

public class FindNumbers {

	public static void main(String[] args) {
		for (int i=2; i< 100; i++) {
			boolean isCommon = true;
						
			for (int j=1; j < i; j++) {
				if (i%j == 0 && j!=1 && j!=i) {
					isCommon = false;
					continue;
				}
			}

			if (isCommon) {
				System.out.println(i);
			}
		}
	}

}
