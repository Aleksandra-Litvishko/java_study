package learnUp;

class TwoDShape1 { // ����������, ����������� ��������� �������
	private double width;
	private double height;
	
	double getWidth() {
		return width;
	}
	
	double getHeight() {
		return height;
	}
	
	void setWidth(double w) {
		width = w;
	}
	
	void setHeight(double h) {
		height = h;
	}
	
	void showDim() {
		System.out.println("������ � ������ - " + width + " � " + height);
	}
}

class Triangle1 extends TwoDShape1 { // ��������, ��� ������������� ������������� 
	String style;
	
	double area() {
		return getWidth() * getHeight() / 2; // ���������������� ��������� � ������ ����������� TwoDShape
	}
	
	void showStyle() {
		System.out.println("����������� " + style);
	}
}

class Rectangle1 extends TwoDShape1 {
	
	double area() {
		return getWidth() * getHeight();
	}
	
	void whoIs() {
		if (getWidth() == getHeight()) {
			System.out.println("������ �������� ���������");
		}
		else {
			System.out.println("������ �������� ���������������");
		}
	}
}

class ShapesWithPrivateMembers7 {
	public static void main(String args[]) {
		Triangle1 t1 = new Triangle1();
		Triangle1 t2 = new Triangle1();
		Rectangle1 r1 = new Rectangle1();
		Rectangle1 r2 = new Rectangle1();
		
		t1.setWidth(4.0); // �������� ���� Triangle �������� ��� ����� ������ Triangle (� �.�. �������������� ��  TwoDShape)
		t1.setHeight(4.0);
		t1.style = "�����������";
		
		t2.setWidth(8.0);
		t2.setHeight(12.0);
		t2.style = "���������";
		
		r1.setWidth(5.0);
		r1.setHeight(6.0);

		r2.setWidth(9.0);
		r2.setHeight(9.0);
		
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