package learnUp; 

class VehicleWith {
	int pass;
	int fuelc;
	int mog;
	
	void rang() {
		System.out.println(" ��������� - " + fuelc * mog + " ����.");
	}
}

class VehicleWithMethod {
	public static void main(String args[]) {
		VehicleWith miniv = new VehicleWith();
		VehicleWith sportsc = new VehicleWith();
		
		miniv.pass = 7;
		miniv.fuelc = 16;
		miniv.mog = 21;
		
		sportsc.pass = 2;
		sportsc.fuelc = 14;
		sportsc.mog = 12;
		
		System.out.print("����-������ ����� ��������� " + miniv.pass + " ����������.");
		miniv.rang();
		
		System.out.print("���������� ���������� ����� ��������� " + sportsc.pass + " ����������.");
		sportsc.rang();
	}
}