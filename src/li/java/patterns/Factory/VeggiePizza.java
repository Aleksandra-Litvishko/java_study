package li.java.patterns.Factory;

public class VeggiePizza implements Pizza {
	public void prepare() {
		System.out.println("Подготовка основы вегетарианской пиццы");
	}
	public void bake(){
		System.out.println("Запекание вегетарианской пиццы");
	}
	public void cut(){
		System.out.println("Нарезка вегетарианской пиццы");
	}
	public void box(){
		System.out.println("Упаковка вегетарианской пиццы");
	}
}
