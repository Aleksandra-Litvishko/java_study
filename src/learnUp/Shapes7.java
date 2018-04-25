package learnUp;

class TwoDShape { // суперкласс, описывающий двумерные объекты
	double width;
	double height;
	
	void showDim() {
		System.out.println("Ширина и высота - " + width + " и " + height);
	}
}

class Triangle extends TwoDShape { // подкласс, для представления треугольников 
	String style;
	
	double area() {
		return width * height / 2; // непосредственное обращение к членам суперкласса TwoDShape
	}
	
	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}

class Shapes7 {
	public static void main(String args[]) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		t1.width = 4.0; // объектам типа Triangle доступны все члены класса Triangle (в т.ч. унаследованные от  TwoDShape)
		t1.height = 4.0;
		t1.style = "закрашенный";
		
		t2.width = 8.0;
		t2.height = 12.0;
		t2.style = "контурный";
		
		System.out.println("Информация о t1: ");
		t1.showDim();
		t1.showStyle();
		System.out.println("Площадь t1: " + t1.area());
		System.out.println();
		
		System.out.println("Информация о t2: ");
		t2.showDim();
		t2.showStyle();
		System.out.println("Площадь t2: " + t2.area());
	}
}