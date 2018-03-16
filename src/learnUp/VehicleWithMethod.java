package learnUp; 

class VehicleWithMethod {
	int pass;
	int fuelc;
	int mog;
	
	void rang() {
		System.out.println("Дальность - " + fuelc * mog + " миль.");
	}
}

class AddMeth {
	public static void main(String args[]) {
		VehicleWithMethod miniv = new VehicleWithMethod();
		VehicleWithMethod sportsc = new VehicleWithMethod();
		
		int rang1, rang2;
		
		miniv.pass = 7;
		miniv.fuelc = 16;
		miniv.mog = 21;
		
		sportsc.pass = 2;
		sportsc.fuelc = 14;
		sportsc.mog = 12;
		
		System.out.print("Мини-фургон может перевезти " + miniv.pass + " пассажиров.");
		miniv.rang();
		
		System.out.print("Спортивный автомобиль может перевезти " + sportsc.pass + " пассажиров.");
		sportsc.rang();
	}
}