package learnUp; // добавление конструктора в класс Vehilce

class Vehicle5{ 
	int passengers5;
	int fuelcup5;
	int mpg5;
	
	Vehicle5(int p, int f, int m) {
		passengers5 = p;
		fuelcup5 = f;
		mpg5 = m;
	}
	
	int range5() {
		return fuelcup5 * mpg5; 
	}
	
	double fuelneeded(int miles) {
		return miles / mpg5; 
	}
}

class VehConsDemo {
	public static void main(String args[]) {
		Vehicle5 t1 = new Vehicle5(7, 16, 21);
		Vehicle5 t2 = new Vehicle5(2, 14, 12);
		
		int dist = 252;
		double gallons;
		
		gallons = t1.fuelneeded(dist);
		
		System.out.println("Для преодоления " + dist + " миль мини-фургону необходимо " + gallons + " галлонов топлива.");
		
		gallons = t2.fuelneeded(dist);
		
		System.out.println("Для преодоления " + dist + " миль спортивному автомобилю необходимо " + gallons + " галлонов топлива.");
		
		
	}
}