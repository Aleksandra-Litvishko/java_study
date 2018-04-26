package learnUp;

class TwoDShape3 { // суперкласс, описывающий двумерные объекты
	private double width;
	private double height;
	
	double getWidth() { // методы доступа к переменным экземпляра
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
		System.out.println("Ширина и высота - " + width + " и " + height);
	}
}

class Triangle3 extends TwoDShape3 { // подкласс, для представления треугольников 
	private String style;
	
	Triangle3(String s, double w, double h) {
		style = s;
		setWidth(w);
		setHeight(h);
	}
	
	double area() {
		return getWidth() * getHeight() / 2; // непосредственное обращение к членам суперкласса TwoDShape
	}
	
	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}

class ShapesConstructorInInherClass7 {
	public static void main(String args[]) {
		Triangle3 t1 = new Triangle3("закрашенный",5.0, 2.5);
		Triangle3 t2 = new Triangle3("прозрачный", 2.0, 6.0);
		
		System.out.println("\nИнформация о t1: ");
		t1.showDim();
		t1.showStyle();
		System.out.println("Площадь t1: " + t1.area());
		
		System.out.println("\nИнформация о t2: ");
		t2.showDim();
		t2.showStyle();
		System.out.println("Площадь t2: " + t2.area());
	}
}