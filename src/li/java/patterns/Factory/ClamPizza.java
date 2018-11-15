package li.java.patterns.Factory;

public class ClamPizza implements Pizza {
	public void prepare() {
		System.out.println("Подготовка морской пиццы");
	}
	public void bake(){
		System.out.println("Запекание морской пиццы");
	}
	public void cut(){
		System.out.println("Нарезка морской пиццы");
	}
	public void box(){
		System.out.println("Упаковка морской пиццы");
	}
}
