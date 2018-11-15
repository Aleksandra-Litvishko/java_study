package li.java.patterns.Factory;

public class CheesePizza implements Pizza {
	public void prepare() {
		System.out.println("Подготовка основы сырной пиццы");
	}
	public void bake(){
		System.out.println("Запекание сырной пиццы");
	}
	public void cut(){
		System.out.println("Нарезка сырной пиццы");
	}
	public void box(){
		System.out.println("Упаковка сырной пиццы");
	}
}
