package li.java.patterns.State;

public class GumballMachineMonitor {
	GumballMachine gumballMachine;
	
	GumballMachineMonitor(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void report() {
		System.out.println("Gumball Machine: " + gumballMachine.getLocation());
		System.out.println("Current inventory: " + gumballMachine.getCount());
		System.out.println("Current state: " + gumballMachine.getState());
	}
}
