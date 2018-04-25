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

class Shapes7 {
	public static void main(String args[]) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		t1.width = 4.0; // �������� ���� Triangle �������� ��� ����� ������ Triangle (� �.�. �������������� ��  TwoDShape)
		t1.height = 4.0;
		t1.style = "�����������";
		
		t2.width = 8.0;
		t2.height = 12.0;
		t2.style = "���������";
		
		System.out.println("���������� � t1: ");
		t1.showDim();
		t1.showStyle();
		System.out.println("������� t1: " + t1.area());
		System.out.println();
		
		System.out.println("���������� � t2: ");
		t2.showDim();
		t2.showStyle();
		System.out.println("������� t2: " + t2.area());
	}
}