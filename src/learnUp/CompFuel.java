package learnUp; 

class Vehicle2 { // добавление параметризированного метода в класс Vehicle
	int passengers3;
	int fuelcup3;
	int mpg4;
	
	int range2() {
		return fuelcup3 * mpg4 ;
	}
	
	double fuelneeded(int miles) {
		return (double) miles / mpg4;
	}
}

class CompFuel {
	public static void main(String args[]) {
		Vehicle2 minivan2 = new Vehicle2();
		Vehicle2 sportscar2 = new Vehicle2();
		
		double gallons;
		int dist = 252;
		
		minivan2.passengers3 = 7;
		minivan2.fuelcup3 = 14;
		minivan2.mpg4 = 21;
		
		sportscar2.passengers3 = 2;
		sportscar2.fuelcup3 = 12;
		sportscar2.mpg4 = 12;
		
		gallons = minivan2.fuelneeded(dist);
		
		System.out.println("Для преодоления " + dist +" миль мини-фургону необходимо " + gallons + " галлонов топлива.");
		
		gallons = sportscar2.fuelneeded(dist);
		
		System.out.println("Для преодоления " + dist + " миль спортивному автомобилю необходимо " + gallons + " галлонов топлива.");
		
		
	}
}