package learnUp;

class TwoDShape8 { // суперкласс, описывающий двумерные объекты
	private double width;
	private double height;
	
	TwoDShape8 () { // конструктор по умолчанию
		width = height = 0.0;
	} 
	
	TwoDShape8 (double w, double h) { // параметризированный конструктор
		width = w;
		height = h;
	}
	
	TwoDShape8 (double d) { // конструирование объекта с одинаковыми зачени€ми переменных экземпл€ра width и height 
		width = height = d;
	}
	
	TwoDShape8 (TwoDShape8 ob) { // конструирование объекта с одинаковыми зачени€ми переменных экземпл€ра width и height 
		width = ob.width;
		height = ob.height;
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

class Triangle8 extends TwoDShape8 { // подкласс, дл€ представлени€ треугольников 
	private String style;
// использование оператора super() дл€ вызова разных форм конструктора суперкласса 
	Triangle8() { 
		super(); // вызвать конструктор суперкласса по умолчанию
		style = "none";
	}
	
	Triangle8(String s, double w, double h) {
		super(w, h); // вызвать конструктор суперкласса с двум€ аргументами
		style = s;
		
	}
	
	Triangle8(String s, double w) {
		super(w); // вызвать конструктор суперкласса с одним аргументом
		style = s;
	}
	
	Triangle8(Triangle8 ob) {
		super(ob); // вызвать конструктор суперкласса с одним аргументом
		style = ob.style;
	}
	
	double area() {
		return getWidth() * getHeight() / 2; // непосредственное обращение к членам суперкласса TwoDShape
	}
	
	void showStyle() {
		System.out.println("“реугольник " + style);
	}
}

class ShapesObjToConstructor7  {
	public static void main(String args[]) {
		Triangle8 t1 = new Triangle8("закрашенный",5.0, 2.5);
		Triangle8 t2 = new Triangle8(t1);
		
		System.out.println("»нформаци€ о t1: ");
		t1.showDim();
		t1.showStyle();
		System.out.println("ѕлощадь t1: " + t1.area());
		
		System.out.println("\n»нформаци€ о t2: ");
		t2.showDim();
		t2.showStyle();
		System.out.println("ѕлощадь t2: " + t2.area());
	}
}