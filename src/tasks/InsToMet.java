package tasks;
class InsToMet {
	public static void main(String args[]) {
		int ins;
		int counter = 0;
		double met;
		for(ins = 1; ins <= 144; ins++) {
			met = ins * 39.37;
			System.out.println(ins + " ������ ������������� " + met + " ������ ");
			counter ++;
			if(counter == 12) {
				System.out.println();
				counter = 0;
			}
		}
	}
}