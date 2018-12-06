package li.java.patterns.PatternsTogether;

public class DuckSimulator {
	public static void main(String args[]) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		AbstractGooseFactory gooseFactory = new GooseAsDuckFactory();
		
		simulator.simulate(duckFactory, gooseFactory);
	}
	
	public void simulate(AbstractDuckFactory duckFactory, AbstractGooseFactory gooseFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = gooseFactory.createGoose();
		
		Flock duckFlock = new Flock();
		
		duckFlock.addDuck(mallardDuck);
		duckFlock.addDuck(redheadDuck);
		duckFlock.addDuck(duckCall);
		duckFlock.addDuck(rubberDuck);
		duckFlock.addDuck(gooseDuck);

		Flock flockOfMallards = new Flock();
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();
		
		flockOfMallards.addDuck(mallardOne);
		flockOfMallards.addDuck(mallardTwo);
		flockOfMallards.addDuck(mallardThree);
		flockOfMallards.addDuck(mallardFour);
		
		duckFlock.addDuck(flockOfMallards);
		
		System.out.println("<<Duck simulator in action>>");
		Quackologist quackologist = new Quackologist();
		flockOfMallards.registerObserver(quackologist);
		
		System.out.println("<<Duck simulator: whole Flock Simulation>>");
		simulate(duckFlock);
		
		System.out.println("<<Duck simulator: Mallard Flock Simulation>>");
		simulate(flockOfMallards);
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}
	
	public void simulate(Quackable duck) {
		duck.quack();
	}
}
