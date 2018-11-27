package li.java.patterns.TemplateMethod;

public class Tea extends CaffeineBeverage {
	void brew() {
		System.out.println("Steeping the tea");
	}
	
	void addCondiments() {
		System.out.println("Adding lemon");
	}
}
