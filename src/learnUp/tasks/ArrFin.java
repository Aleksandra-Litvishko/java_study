package learnUp.tasks;

class ArrFin {
	public static void main(String args[]) {
		double arr[] = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
		int sum = 0;

		for(double x: arr) {
			sum += x;
		}
		
		System.out.println("\nCреднее арифметическое для массива: " + (sum / arr.length));
	}
}