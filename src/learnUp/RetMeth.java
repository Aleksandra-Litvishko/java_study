package learnUp;

class Vehicle1 {
	int pass1;
	int fuelc1;
	int mpg2;
	
	int range1() {
		return mpg2 * fuelc1;
	}
}

class RetMeth {
	public static void main(String args[]) {
		Vehicle1 minivan1 = new Vehicle1();
		Vehicle1 sportscar1 = new Vehicle1();
		
		minivan1.pass1 = 7;
		minivan1.fuelc1 = 15;
		minivan1.mpg2 = 14;
		
		sportscar1.pass1 = 2;
		sportscar1.fuelc1 = 10;
		sportscar1.mpg2 = 12;

		
		System.out.println("����-������ ����� ��������� " + minivan1.pass1 + " ���������� �� ���������� " + minivan1.range1() + " ����. ");
		System.out.println("���������� ���������� ����� ��������� " + sportscar1.pass1 + " ���������� �� ���������� " + sportscar1.range1() + " ����.\n");
		
		if (minivan1.range1() > sportscar1.range1()) System.out.print("����-������ ����� �������� ������.");
		
		if (minivan1.range1() < sportscar1.range1()) System.out.print("���������� ���������� ����� �������� ������.");
	}
}