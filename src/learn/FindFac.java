package learn;

class FindFac {
	public static void main(String args[]) {
		int counter = 0;
		
		 for(int i = 2; i <= 100; i++) {
			System.out.print("Делители " + i + ": ");
			
			for(int j = 2; j <= i / 2; j++) {
				if ((i % j) == 0) System.out.print(j + " "); 
				counter++;
			}
			
			System.out.println();
		}
		 System.out.println("Количество итераций: " + counter);
	}
}