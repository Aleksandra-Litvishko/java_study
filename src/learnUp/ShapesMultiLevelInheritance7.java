package learnUp;

class TwoDShape7 {
	private double weight;
	private double height;
	
	TwoDShape7 () {
		weight = height = 0.0;
	}
	
	TwoDShape7 (double d) {
		weight = height = d;
	}
	
	TwoDShape7 (double w, double h) {
		weight = w;
		height = h;
	}
	
	double getWeight () {
		return weight;
	}
	
	double getHeight () {
		return height;
	}
	
	void setWeight(double sw) {
		weight = sw;
	}
	
	void setHeight(double sh) {
		height = sh;
	}
	
	void showDim () {
		System.out.println("Ширина и высота: " + weight + " " + height);
	}
}

class Triangle7 extends TwoDShape7 {
	private String style;
	
	Triangle7 () {
		super();
		style = "none";
	}
	
	Triangle7 (String str, double h) {
		super(h);
	}
	
	Triangle7 (String str, double w, double h) {
		super(w, h);
		style = str;
	}
	
	String getStyle () {
		return style;
	}
	
	void setStyle (String s) {
		style = s;
	}
	
	void showStyle() {
		System.out.println("Треугольник " + style);
	}
	 double area () {
		return getHeight() * getWeight() /2;
	}
}

class ColorTriangle extends Triangle7 {
	private String color;
	
	ColorTriangle(String col, String st, double x, double y) {
		super(st, x, y);
		color = col;
	}
	
	ColorTriangle(String st, double x, double y) {
		super(st, x, y);
	}
	
	ColorTriangle( String x, double y) {
		super(x, y);
	}
	
	ColorTriangle() {
		super();
	}
	
	String getColor () {
		return color;
	}
	
	void showColor () {
		System.out.println("Цвет - " + color);
	}
}

class ShapesMultiLevelInheritance7 {
	public static void main(String args[]) {
		ColorTriangle ob = new ColorTriangle("Голубой", "контурный", 1.2, 1.2);
		ColorTriangle ob1 = new ColorTriangle("перфорированный", 1.2, 1.2);
		ColorTriangle ob2 = new ColorTriangle("заштрихованный", 1.2);
		ColorTriangle ob3 = new ColorTriangle();
		
		System.out.println("Информация об ob: ");
		ob.showDim();
		ob.showStyle();
		ob.showColor();
		System.out.println("Площадь t1: " + ob.area());
		System.out.println();
		
		System.out.println("Информация об ob1: ");
		ob1.showDim();
		ob1.showStyle();
		ob1.showColor();
		System.out.println("Площадь t1: " + ob1.area());
		System.out.println();
		
		System.out.println("Информация об ob2: ");
		ob2.showDim();
		ob2.showStyle();
		ob2.showColor();
		System.out.println("Площадь t1: " + ob2.area());
		System.out.println();
		
		System.out.println("Информация об ob3: ");
		ob3.showDim();
		ob3.showStyle();
		ob3.showColor();
		System.out.println("Площадь t1: " + ob3.area());
		System.out.println();
	}
}