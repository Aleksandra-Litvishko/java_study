package learnUp;

class TwoDShape9 { // суперкласс, описывающий двумерные объекты
	private double width;
	private double height;
	private String name;
	
	TwoDShape9() {
		width = height = 0.0;
		name = "none";
	}
	
	TwoDShape9(double w, double h, String n) {
		width = w;
		height = h ; 
		name = n;
	}
	
	TwoDShape9(double d, String n) {
		width = height = d;
		name = n;
	}
	
	TwoDShape9(TwoDShape9 ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
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
		System.out.println("Ширина и высота - " + width + " и " + height);
	}
	
	String getName() {
		return name;
	}
	
	double area() {
		System.out.println("Метод area должен быть переопределён");
		return 0.0;
	}
}

class Triangle9 extends TwoDShape9 { // подкласс, для представления треугольников 
	private String style;
	
	Triangle9() {
		super();
		style = "none";
	}
	
	Triangle9(String s, double w, double h) {
		super(w, h, "треугольник");
		style = s;
	}
	
	Triangle9(double x) {
		super(x, "треугольник");
		style = "закрашенный";
	}
	
	Triangle9(Triangle9 ob) {
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

class Rectangle9 extends TwoDShape9 {
	
	Rectangle9() {
		super();
	}
	
	Rectangle9(double w, double h) {
		super(w, h, "прямоугольник");
	}
	
	Rectangle9(double x) {
		super(x, "прямоугольник");
	}
	
	Rectangle9(Rectangle9 ob) {
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

class TwoDShapeFin7 {
	public static void main(String args[]) {
		TwoDShape9 shapes [] = new TwoDShape9[5];
		
		shapes[0] = new Triangle9("контурный", 8.0, 12.0);
		shapes[1] = new Rectangle9(10);
		shapes[2] = new Rectangle9(10, 4);
		shapes[3] = new Triangle9(7.0);
		shapes[4] = new TwoDShape9(10, 20, "фигура");
		
		for(int i = 0; i < shapes.length; i++) {
			System.out.println("Объект " + shapes[i].getName());
			System.out.println("Площадь: " + shapes[i].area());
			System.out.println();
		}
	}
}