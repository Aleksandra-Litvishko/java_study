package learnUp; 

class VehicleWith { // С использованием метода класса
	int pass;
	int fuelc;
	int mpg1;
	VehicleInner test;
	
	void rang() {
		int x = 1;
		System.out.println(" Дальность - " + fuelc * mpg1 + " миль.");
	}
}

class VehicleInner { // С использованием метода класса
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
		VehicleInner test = new VehicleInner();
		
		miniv.pass = 7;
		miniv.fuelc = 16;
		miniv.mpg1 = 21;
		miniv.test = test;
		
		
		sportsc.pass = 2;
		sportsc.fuelc = 14;
		sportsc.mpg1 = 12;
		
		System.out.print("Мини-фургон может перевезти " + miniv.pass + " пассажиров.");
		miniv.rang();
		
		System.out.print("Спортивный автомобиль может перевезти " + sportsc.pass + " пассажиров.");
		sportsc.rang();
	}
}