package li.java.patterns.State;

public class SoldState implements State {
GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Please, wait. We are already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you are already turned the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turninh twice doesn't get you another gumball!");	
	}

	@Override
	public void dispence() {
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Oops! Out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	} 
}
