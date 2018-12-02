package li.java.patterns.State;

public class GumballMachine {
	State soldOutState;
	State soldState;
	State noQuarterState;
	State hasQuarterState;
	State winnerState;

	State state = soldOutState;
	int count = 0;

	public GumballMachine(int numberGumballs) {
		count = numberGumballs;
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		winnerState = new WinnerState(this);
		if(numberGumballs > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispence();
	}

	public void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if(count != 0) {
			count = count - 1;
		}
	}
	
	public int getCount() {
		return count;
	}
	
	public State getNoQuarterState() {
		return noQuarterState;
	}
	
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public State getSoldState() {
		return soldState;
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}
	
	public State getWinnerState() {
		return winnerState;
	}
	
	public String toString() {
		return "Gumball Machine # 0001 \n Inventory:" + count;
	}
}
