package li.java.patterns.TemplateMethod;

public abstract class CaffeineBeverage {
	final void prepareRecipe() { // шаблонный метод
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling water");
	}
	
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
