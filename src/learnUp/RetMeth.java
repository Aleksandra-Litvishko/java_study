package learnUp;

class Vehicle1 {
	int pass1;
	int fuelc1;
	int mpg2;
	
	int range1() {
		return mpg2 * fuelc1;
	}
}

class RetMeth {
	public static void main(String args[]) {
		Vehicle1 minivan1 = new Vehicle1();
		Vehicle1 sportscar1 = new Vehicle1();
		
		minivan1.pass1 = 7;
		minivan1.fuelc1 = 15;
		minivan1.mpg2 = 14;
		
		sportscar1.pass1 = 2;
		sportscar1.fuelc1 = 10;
		sportscar1.mpg2 = 12;

		
		System.out.println("Мини-фургон может перевезти " + minivan1.pass1 + " пассажиров на расстояние " + minivan1.range1() + " миль. ");
		System.out.println("Спортивный автомобиль может перевезти " + sportscar1.pass1 + " пассажиров на расстояние " + sportscar1.range1() + " миль.\n");
		
		if (minivan1.range1() > sportscar1.range1()) System.out.print("Мини-фургон может проехать дальше.");
		
		if (minivan1.range1() < sportscar1.range1()) System.out.print("Спортивный автомобиль может проехать дальше.");
	}
}