package learnUp;

class TwoDShape5 { // суперкласс, описывающий двумерные объекты
	private double width;
	private double height;
	
	TwoDShape5 () { // конструктор по умолчанию
		width = height = 0.0;
	} 
	
	TwoDShape5 (double w, double h) { // параметризированный конструктор
		width = w;
		height = h;
	}
	
	TwoDShape5 (double d) { // конструирование объекта с одинаковыми зачени€ми переменных экземпл€ра width и height 
		width = height = d;
	}
	
	double getWidth() { // методы доступа к переменным экземпл€ра width и height
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
		System.out.println("Ўирина и высота - " + width + " и " + height);
	}
}

class Triangle5 extends TwoDShape5 { // подкласс, дл€ представлени€ треугольников 
	private String style;
// использование оператора super() дл€ вызова разных форм конструктора суперкласса 
	Triangle5() { 
		super(); // вызвать конструктор суперкласса по умолчанию
		style = "none";
	}
	
	Triangle5(String s, double w, double h) {
		super(w, h); // вызвать конструктор суперкласса с двум€ аргументами
		style = s;
		
	}
	
	Triangle5(String s, double w) {
		super(w); // вызвать конструктор суперкласса с одним аргументом
		style = "закрашенный";
		
	}
	
	double area() {
		return getWidth() * getHeight() / 2; // непосредственное обращение к членам суперкласса TwoDShape
	}
	
	void showStyle() {
		System.out.println("“реугольник " + style);
	}
}

class ShapesConstructorsOverload7 {
	public static void main(String args[]) {
		Triangle5 t1 = new Triangle5("закрашенный",5.0, 2.5);
		Triangle5 t2 = new Triangle5("прозрачный", 2.0);
		Triangle5 t3 = new Triangle5();
		
		System.out.println("»нформаци€ о t1: ");
		t1.showDim();
		t1.showStyle();
		System.out.println("ѕлощадь t1: " + t1.area());
		
		System.out.println("\n»нформаци€ о t2: ");
		t2.showDim();
		t2.showStyle();
		System.out.println("ѕлощадь t2: " + t2.area());
		
		System.out.println("\n»нформаци€ о t3: ");
		t3.showDim();
		t3.showStyle();
		System.out.println("ѕлощадь t2: " + t3.area());
	}
}