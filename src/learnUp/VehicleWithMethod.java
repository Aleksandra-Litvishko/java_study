package learnUp; 

class VehicleWith { // � �������������� ������ ������
	int pass;
	int fuelc;
	int mpg1;
	VehicleInner test;
	
	void rang() {
		System.out.println(" ��������� - " + fuelc * mpg1 + " ����.");
	}
}

class VehicleInner { // � �������������� ������ ������
	int pass;
	int fuelc;
	int mpg1;
	
	void rang() {
		System.out.println(" ��������� - " + fuelc * mpg1 + " ����.");
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
		
		System.out.print("����-������ ����� ��������� " + miniv.pass + " ����������.");
		miniv.rang();
		
		System.out.print("���������� ���������� ����� ��������� " + sportsc.pass + " ����������.");
		sportsc.rang();
	}
}