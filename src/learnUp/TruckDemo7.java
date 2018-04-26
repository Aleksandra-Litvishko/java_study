package learnUp;

class Vehicle3 {
	private int passengers; // ���������� ����������
	private int fuelcup; // ������� ���������� ����  � ��������
	private int mpg; // ����������� ������� � ����� �� ������
	
	Vehicle3(int p,int f,int m) {
		passengers = p;
		fuelcup = f;
		mpg = m;
	}
	
	int range() { // ���������� ��������� ������� ������������� ��������
		return mpg * fuelcup;
	}
	
	double fuelneeded(int miles) { // ��������� ����� �������, ������������ ��� ����������� ��������� ���� (miles)
		return miles/ mpg;
	}
	
	int getPassengers() { // ������ ������� � ���������� ����������
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

class Truck extends Vehicle3 { // ���������� ����������� Vehicle4 ��� ����������
	private int cargocup; // ���������������� � ������
	
	Truck(int p, int f, int m, int c) { 
		super(p, f, m); // ������������� ������ ������ Vehicle � �������������� ������������ ����� ������
		cargocup = c;
	}
	
	int getCargo () { // ������ ������� � ���������� cargocup
		return cargocup;
	}
	
	void putCargo (int c) {
		cargocup = c;
	}
}

class TruckDemo7 { // � ���� ������ ����������� ������� ���� Vehicle
	public static void main(String args[]) {
		Truck semi = new Truck(2, 200, 7, 44000); // ��� �������� ���� Truck
		Truck pickup = new Truck(3, 28, 15, 2000);
		double gallons;
		int dist = 252;
		
		gallons = semi.fuelneeded(dist);
		System.out.println("�������� ����� ��������� " + semi.getCargo() + " ������");
		System.out.println("��� ����������� " + dist + " ���� ��������� ���������� " + gallons + " �������� �������.");
		
		gallons = pickup.fuelneeded(dist);
		System.out.println("����� ����� ��������� " + pickup.getCargo() + " ������");
		System.out.println("��� ����������� " + dist + " ���� ������ ���������� " + gallons + " �������� �������.");
	}
}

