package learnUp.tasks;

class ArrFin {
	public static void main(String args[]) {
		double arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int res = 0;
		int counter = 0;

		for(double x: arr) {
			res += x;
			counter++;

			if(counter == arr.length) {
				res /= arr.length;
			}
		}
		System.out.println("\nCреднее арифметическое для массива:");
		for(double x: arr) {
			System.out.print(x + " ");
		}
		System.out.println("\nравно: " + res);
	}
}