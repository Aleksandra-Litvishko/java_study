package learn;

class Recurs {
	
	static int FactR(int i) {
		if (i == 1) return 1;
		int Fact = i * FactR(i - 1);
		return Fact;
	}
}

class RecursFact {
	public static void main(String args[]) {
		System.out.println(Recurs.FactR(8));
	}
}