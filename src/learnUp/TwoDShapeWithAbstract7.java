package learnUp;

abstract class TwoDShape10 { // создание абстрактного класса
	private double width;
	private double height;
	private String name;
	
	TwoDShape10() { // конструктор по умолчанию
		width = height = 0.0;
		name = "none";
	}
	
	TwoDShape10(double w, double h, String n) { // параметризированный конструктор
		width = w;
		height = h ; 
		name = n;
	}
	
	TwoDShape10(double d, String n) { // создание объекта с одинаковыми значениями переменных экземпляра width и height
		width = height = d;
		name = n;
	}
	
	TwoDShape10(TwoDShape10 ob) { // создать один объект на основе другого
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	double getWidth() { // методы доступа к переменным width и height
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
	
	String getName() {
		return name;
	}
	
	abstract double area(); // создание АБСТРАКТНОГО метода area()
}

class Triangle10 extends TwoDShape10 { // подкласс, для представления треугольников 
	private String style;
	
	Triangle10() {
		super();
		style = "none";
	}
	
	Triangle10(String s, double w, double h) {
		super(w, h, "треугольник");
		style = s;
	}
	
	Triangle10(double x) {
		super(x, "треугольник");
		style = "закрашенный";
	}
	
	Triangle10(Triangle10 ob) {
		super(ob);
		style = ob.style;
	}
	
	double area() {
		return getWidth() * getHeight() / 2; // непосредственное обращение к членам суперкласса TwoDShape
	}
	
	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}

class Rectangle10 extends TwoDShape10 {
	
	Rectangle10() {
		super();
	}
	
	Rectangle10(double w, double h) {
		super(w, h, "прямоугольник");
	}
	
	Rectangle10(double x) {
		super(x, "прямоугольник");
	}
	
	Rectangle10(Rectangle10 ob) {
		super(ob);
	}
	
	boolean isSquare() {
		if (getWidth() == getHeight()) {
			return true;
		}
		else {
			return false;
		}
	}

	double area() {
		return getWidth() * getHeight();
	}
}

class TwoDShapeWithAbstract7 {
	public static void main(String args[]) {
		TwoDShape10 shapes [] = new TwoDShape10[4];
		
		shapes[0] = new Triangle10("контурный", 8.0, 12.0); 
		shapes[1] = new Rectangle10(10);
		shapes[2] = new Rectangle10(10, 4);
		shapes[3] = new Triangle10(7.0);
		
		for(int i = 0; i < shapes.length; i++) {
			System.out.println("Объект " + shapes[i].getName());
			System.out.println("Площадь: " + shapes[i].area());
			System.out.println();
		}
	}
}