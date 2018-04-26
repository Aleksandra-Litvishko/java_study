package learnUp;

class TwoDShape5 { // ����������, ����������� ��������� �������
	private double width;
	private double height;
	
	TwoDShape5 () { // ����������� �� ���������
		width = height = 0.0;
	} 
	
	TwoDShape5 (double w, double h) { // ������������������� �����������
		width = w;
		height = h;
	}
	
	TwoDShape5 (double d) { // ��������������� ������� � ����������� ��������� ���������� ���������� width � height 
		width = height = d;
	}
	
	double getWidth() { // ������ ������� � ���������� ���������� width � height
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

class Triangle5 extends TwoDShape5 { // ��������, ��� ������������� ������������� 
	private String style;
// ������������� ��������� super() ��� ������ ������ ���� ������������ ����������� 
	Triangle5() { 
		super(); // ������� ����������� ����������� �� ���������
		style = "none";
	}
	
	Triangle5(String s, double w, double h) {
		super(w, h); // ������� ����������� ����������� � ����� �����������
		style = s;
		
	}
	
	Triangle5(String s, double w) {
		super(w); // ������� ����������� ����������� � ����� ����������
		style = "�����������";
		
	}
	
	double area() {
		return getWidth() * getHeight() / 2; // ���������������� ��������� � ������ ����������� TwoDShape
	}
	
	void showStyle() {
		System.out.println("����������� " + style);
	}
}

class ShapesConstructorsOverload7 {
	public static void main(String args[]) {
		Triangle5 t1 = new Triangle5("�����������",5.0, 2.5);
		Triangle5 t2 = new Triangle5("����������", 2.0);
		Triangle5 t3 = new Triangle5();
		
		System.out.println("���������� � t1: ");
		t1.showDim();
		t1.showStyle();
		System.out.println("������� t1: " + t1.area());
		
		System.out.println("\n���������� � t2: ");
		t2.showDim();
		t2.showStyle();
		System.out.println("������� t2: " + t2.area());
		
		System.out.println("\n���������� � t3: ");
		t3.showDim();
		t3.showStyle();
		System.out.println("������� t2: " + t3.area());
	}
}