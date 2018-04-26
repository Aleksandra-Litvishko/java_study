package learnUp;

class TwoDShape { // ����������, ����������� ��������� �������
	double width;
	double height;
	
	void showDim() {
		System.out.println("������ � ������ - " + width + " � " + height);
	}
}

class Triangle extends TwoDShape { // ��������, ��� ������������� ������������� 
	String style;
	
	double area() {
		return width * height / 2; // ���������������� ��������� � ������ ����������� TwoDShape
	}
	
	void showStyle() {
		System.out.println("����������� " + style);
	}
}

class Rectangle extends TwoDShape {
	
	double area() {
		return width * height;
	}
	
	void whoIs() {
		if (width == height) {
			System.out.println("������ �������� ���������");
		}
		else {
			System.out.println("������ �������� ���������������");
		}
	}
}

class Shapes7 {
	public static void main(String args[]) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		t1.width = 4.0; // �������� ���� Triangle �������� ��� ����� ������ Triangle (� �.�. �������������� ��  TwoDShape)
		t1.height = 4.0;
		t1.style = "�����������";
		
		t2.width = 8.0;
		t2.height = 12.0;
		t2.style = "���������";
		
		r1.width = 5;
		r1.height = 6;

		r2.width = 9;
		r2.height = 9;
		
		System.out.println("\n���������� � t1: ");
		t1.showDim();
		t1.showStyle();
		System.out.println("������� t1: " + t1.area());
		
		System.out.println("\n���������� � t2: ");
		t2.showDim();
		t2.showStyle();
		System.out.println("������� t2: " + t2.area());
		
		System.out.println("\n���������� � r1: ");
		r1.showDim();
		r1.whoIs();
		System.out.println("������� r1: "  + r1.area());
		
		System.out.println("\n���������� � r2: ");
		r2.showDim();
		r2.whoIs();
		System.out.println("������� r2: " + r2.area());
	}
}