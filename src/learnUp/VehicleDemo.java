package learnUp;

class Vehicle {
	int passengers; // ���������� ����������
	int fuelcup; // ������� ���������� ����
	int mpg; // ����������� ������� � ����� �� �����
}

class VehicleDemo { // � ���� ������ ����������� ������� ���� Vehicle
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range, range1;
		
		// ��������� �������� ����� � ������� minivan
		minivan.passengers = 7;
		minivan.fuelcup = 16;
		minivan.mpg = 21;
		
		// ��������� �������� ����� � ������� sportscar
		sportscar.passengers = 2;
		sportscar.fuelcup = 14;
		sportscar.mpg = 12;
		
		// ���������� ��������� ������� ��� ������ ����
		range = minivan.fuelcup * minivan.mpg;
		range1 = sportscar.fuelcup * sportscar.mpg;
		
		System.out.println("����-������ ����� ��������� " + minivan.passengers + " ���������� �� ���������� " + range + " ����." );
		System.out.println("���������� ���������� ����� ��������� " + sportscar.passengers + " ���������� �� ���������� " + range1 + " ����.");
	}
}