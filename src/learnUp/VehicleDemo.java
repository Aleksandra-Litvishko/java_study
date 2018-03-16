package learnUp;

class Vehicle {
	int passengers; // количество пассажиров
	int fuelcup; // ёмкость топливного бака
	int mpg; // потребление топлива в милях на галон
}

class VehicleDemo { // в этом классе объявляются объекты типа Vehicle
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range, range1;
		
		// присвоить значения полям в объекте minivan
		minivan.passengers = 7;
		minivan.fuelcup = 16;
		minivan.mpg = 21;
		
		// присвоить значения полям в объекте sportscar
		sportscar.passengers = 2;
		sportscar.fuelcup = 14;
		sportscar.mpg = 12;
		
		// рассчитать дальность поездки при полном баке
		range = minivan.fuelcup * minivan.mpg;
		range1 = sportscar.fuelcup * sportscar.mpg;
		
		System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на расстояние " + range + " миль." );
		System.out.println("Спортивный автомобиль может перевезти " + sportscar.passengers + " пассажиров на расстояние " + range1 + " миль.");
	}
}