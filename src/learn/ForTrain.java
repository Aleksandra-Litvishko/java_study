package learn;

class ForTrain {
	public static void main(String args[]) {
		int i, counter;
		
		counter = 1;
		for(i = 0; i <= 237; i++, counter++) {
			if(i%2 == 0) {
			System.out.println("Значение i: " + i);
			}
			if (counter%15 == 0) {
				System.out.println("");
			}
		}
	}
}