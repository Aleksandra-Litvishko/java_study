package learnUp; 

class VehicleWith {
	int pass;
	int fuelc;
	int mpg1;
	
	void rang() {
		System.out.println(" Дальность - " + fuelc * mpg1 + " миль.");
	}
}

class VehicleWithMethod {
	public static void main(String args[]) {
		VehicleWith miniv = new VehicleWith();
		VehicleWith sportsc = new VehicleWith();
		
		miniv.pass = 7;
		miniv.fuelc = 16;
		miniv.mpg1 = 21;
		
		sportsc.pass = 2;
		sportsc.fuelc = 14;
		sportsc.mpg1 = 12;
		
		System.out.print("Мини-фургон может перевезти " + miniv.pass + " пассажиров.");
		miniv.rang();
		
		System.out.print("Спортивный автомобиль может перевезти " + sportsc.pass + " пассажиров.");
		sportsc.rang();
	}
}