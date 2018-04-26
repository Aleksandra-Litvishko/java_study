package learnUp;

class TwoDShape4 { // суперкласс, описывающий двумерные объекты
	private double width;
	private double height;
	
	TwoDShape4 (double w, double h) {
		width = w;
		height = h;
	}
	
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

class Triangle4 extends TwoDShape4 { // подкласс, для представления треугольников 
	private String style;
	
	Triangle4(String s, double w, double h) {
		super(w, h);
		style = s;
		
	}
	
	double area() {
		return getWidth() * getHeight() / 2; // непосредственное обращение к членам суперкласса TwoDShape
	}
	
	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}

class ShapesConstructorsInBothClasses7 {
	public static void main(String args[]) {
		Triangle4 t1 = new Triangle4("закрашенный",5.0, 2.5);
		Triangle4 t2 = new Triangle4("прозрачный", 2.0, 6.0);
		
		System.out.println("Информация о t1: ");
		t1.showDim();
		t1.showStyle();
		System.out.println("Площадь t1: " + t1.area());
		
		System.out.println("\nИнформация о t2: ");
		t2.showDim();
		t2.showStyle();
		System.out.println("Площадь t2: " + t2.area());
	}
}