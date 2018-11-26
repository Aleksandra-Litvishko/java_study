package li.java.patterns.Adapter;

public class DuckTestDrive {
	public static void main(String args[]) {
		WildTurkey turkey = new WildTurkey();
		Duck duck = new MallardDuck();
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
		
		
		System.out.println("The turkey says:");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe duck says:");
		duckTest(duck);
		
		System.out.println("\nThe TurkeyAdapter says:");
		duckTest(turkeyAdapter);
	}
	
	public static void duckTest(Duck duck) {
		duck.quack();
		duck.fly();
		System.out.println();
	}
}
