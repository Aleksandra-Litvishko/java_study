package learnUp;

class TwoDShape8 { // ����������, ����������� ��������� �������
	private double width;
	private double height;
	
	TwoDShape8 () { // ����������� �� ���������
		width = height = 0.0;
	} 
	
	TwoDShape8 (double w, double h) { // ������������������� �����������
		width = w;
		height = h;
	}
	
	TwoDShape8 (double d) { // ��������������� ������� � ����������� ��������� ���������� ���������� width � height 
		width = height = d;
	}
	
	TwoDShape8 (TwoDShape8 ob) { // ��������������� ������� � ����������� ��������� ���������� ���������� width � height 
		width = ob.width;
		height = ob.height;
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

class Triangle8 extends TwoDShape8 { // ��������, ��� ������������� ������������� 
	private String style;
// ������������� ��������� super() ��� ������ ������ ���� ������������ ����������� 
	Triangle8() { 
		super(); // ������� ����������� ����������� �� ���������
		style = "none";
	}
	
	Triangle8(String s, double w, double h) {
		super(w, h); // ������� ����������� ����������� � ����� �����������
		style = s;
		
	}
	
	Triangle8(String s, double w) {
		super(w); // ������� ����������� ����������� � ����� ����������
		style = s;
	}
	
	Triangle8(Triangle8 ob) {
		super(ob); // ������� ����������� ����������� � ����� ����������
		style = ob.style;
	}
	
	double area() {
		return getWidth() * getHeight() / 2; // ���������������� ��������� � ������ ����������� TwoDShape
	}
	
	void showStyle() {
		System.out.println("����������� " + style);
	}
}

class ShapesObjToConstructor7  {
	public static void main(String args[]) {
		Triangle8 t1 = new Triangle8("�����������",5.0, 2.5);
		Triangle8 t2 = new Triangle8(t1);
		
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