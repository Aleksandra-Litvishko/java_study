package learnUp;

class Vehicle3 {
	private int passengers; // количество пассажиров
	private int fuelcup; // Ємкость топливного бака  в галлонах
	private int mpg; // потребление топлива в мил€х на галлон
	
	Vehicle3(int p,int f,int m) {
		passengers = p;
		fuelcup = f;
		mpg = m;
	}
	
	int range() { // возвратить дальность поездки транспортного средства
		return mpg * fuelcup;
	}
	
	double fuelneeded(int miles) { // вычислить объЄм топлива, требующегос€ дл€ прохождени€ заданного пути (miles)
		return miles/ mpg;
	}
	
	int getPassengers() { // методы доступа к переменным экземпл€ра
		return passengers;
	}
	void setPassengers(int p) {
		passengers = p;
	}
	int getFuelcup() {
		return fuelcup;
	}
	void setFuelcup(int f) {
		fuelcup = f;
	}
	int getMpg() {
		return mpg;
	}
	void setMpg(int m) {
		mpg = m;
	}
}

class Truck extends Vehicle3 { // расширение суперкласса Vehicle4 дл€ грузовиков
	private int cargocup; // грузоподъемность в фунтах
	
	Truck(int p, int f, int m, int c) { 
		super(p, f, m); // инициализаци€ членов класса Vehicle с использованием конструктора этого класса
		cargocup = c;
	}
	
	int getCargo () { // методы доступа к переменной cargocup
		return cargocup;
	}
	
	void putCargo (int c) {
		cargocup = c;
	}
}

class TruckDemo7 { // в этом классе объ€вл€ютс€ объекты типа Vehicle
	public static void main(String args[]) {
		Truck semi = new Truck(2, 200, 7, 44000); // р€д объектов типа Truck
		Truck pickup = new Truck(3, 28, 15, 2000);
		double gallons;
		int dist = 252;
		
		gallons = semi.fuelneeded(dist);
		System.out.println("√рузовик может перевезти " + semi.getCargo() + " фунтов");
		System.out.println("ƒл€ преодолени€ " + dist + " миль грузовику необходимо " + gallons + " галлонов топлива.");
		
		gallons = pickup.fuelneeded(dist);
		System.out.println("ѕикап может перевезти " + pickup.getCargo() + " фунтов");
		System.out.println("ƒл€ преодолени€ " + dist + " миль пикапу необходимо " + gallons + " галлонов топлива.");
	}
}

