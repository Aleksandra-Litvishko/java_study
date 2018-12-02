package li.java.patterns.State;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You can't pay for a gumball. The machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("The machine is sold out");
	}

	@Override
	public void dispence() {
		System.out.println("No gumball dispensed");
	}
}
