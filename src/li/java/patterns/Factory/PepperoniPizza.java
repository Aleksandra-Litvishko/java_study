package li.java.patterns.Factory;

public class PepperoniPizza implements Pizza {
	public void prepare() {
		System.out.println("Подготовка пиццы пепперони");
	}
	public void bake(){
		System.out.println("Запекание пиццы пепперони");
	}
	public void cut(){
		System.out.println("Нарезка пиццы пепперони");
	}
	public void box(){
		System.out.println("Упаковка пиццы пепперони");
	}
}
