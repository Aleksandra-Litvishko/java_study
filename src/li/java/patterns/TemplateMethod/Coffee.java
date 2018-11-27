package li.java.patterns.TemplateMethod;

public class Coffee extends CaffeineBeverage {
	void brew() {
		System.out.println("Dripping coffee through filter");
	}
	
	void addCondiments() {
		System.out.println("Adding sugar and milk");
	}
}
