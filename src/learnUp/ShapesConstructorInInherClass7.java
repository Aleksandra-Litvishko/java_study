package learnUp;

class TwoDShape3 { // ����������, ����������� ��������� �������
	private double width;
	private double height;
	
	double getWidth() { // ������ ������� � ���������� ����������
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

class Triangle3 extends TwoDShape3 { // ��������, ��� ������������� ������������� 
	private String style;
	
	Triangle3(String s, double w, double h) {
		style = s;
		setWidth(w);
		setHeight(h);
	}
	
	double area() {
		return getWidth() * getHeight() / 2; // ���������������� ��������� � ������ ����������� TwoDShape
	}
	
	void showStyle() {
		System.out.println("����������� " + style);
	}
}

class ShapesConstructorInInherClass7 {
	public static void main(String args[]) {
		Triangle3 t1 = new Triangle3("�����������",5.0, 2.5);
		Triangle3 t2 = new Triangle3("����������", 2.0, 6.0);
		
		System.out.println("\n���������� � t1: ");
		t1.showDim();
		t1.showStyle();
		System.out.println("������� t1: " + t1.area());
		
		System.out.println("\n���������� � t2: ");
		t2.showDim();
		t2.showStyle();
		System.out.println("������� t2: " + t2.area());
	}
}