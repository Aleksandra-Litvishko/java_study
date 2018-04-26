package learnUp;

class TwoDShape4 { // ����������, ����������� ��������� �������
	private double width;
	private double height;
	
	TwoDShape4 (double w, double h) {
		width = w;
		height = h;
	}
	
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

class Triangle4 extends TwoDShape4 { // ��������, ��� ������������� ������������� 
	private String style;
	
	Triangle4(String s, double w, double h) {
		super(w, h);
		style = s;
		
	}
	
	double area() {
		return getWidth() * getHeight() / 2; // ���������������� ��������� � ������ ����������� TwoDShape
	}
	
	void showStyle() {
		System.out.println("����������� " + style);
	}
}

class ShapesConstructorsInBothClasses7 {
	public static void main(String args[]) {
		Triangle4 t1 = new Triangle4("�����������",5.0, 2.5);
		Triangle4 t2 = new Triangle4("����������", 2.0, 6.0);
		
		System.out.println("���������� � t1: ");
		t1.showDim();
		t1.showStyle();
		System.out.println("������� t1: " + t1.area());
		
		System.out.println("\n���������� � t2: ");
		t2.showDim();
		t2.showStyle();
		System.out.println("������� t2: " + t2.area());
	}
}