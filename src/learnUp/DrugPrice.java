package learnUp;

class Drugs {
	int ShipPrice;
	int ExtraCharge;
	float Discount = (float) 0.9;
	String GroupDrugs;
	
	Drugs(String gr) {
		GroupDrugs = gr;
	}
	
	 float FinPrice(int s, int e) {
		 ShipPrice = s;
		 ExtraCharge = e;
		 
		if (GroupDrugs == "nootrops") return (float) ((s + e) * Discount);
		else return (s + e);
	}
}

class DrugPrice {
	public static void main(String args[]) {
		Drugs nootropil = new Drugs("nootrops");
		Drugs ginkgoum = new Drugs("nootrops");
		Drugs phenotropil = new Drugs("nootrops");
		Drugs pantogam = new Drugs("vitamins");
		
		System.out.println("Конечная цена ноотропила со скидкой: " + nootropil.FinPrice(250, 57) + " рублей.");
		System.out.println("Конечная цена гинкгоума со скидкой: " + ginkgoum.FinPrice(200, 120) + " рублей.");
		System.out.println("Конечная цена фенотропила со скидкой: " + phenotropil.FinPrice(500, 190) + " рублей.");
		System.out.println("Конечная цена пантогама со скидкой: " + pantogam.FinPrice(300, 101) + " рублей.");
	}
}