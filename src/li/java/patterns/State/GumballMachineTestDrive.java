package li.java.patterns.State;

public class GumballMachineTestDrive {
	public static void main(String [] args) {
		GumballMachine gumballMachine = new GumballMachine("Chernyshevskaya st.50",5);
		GumballMachineMonitor gumballMachineMonitor = new GumballMachineMonitor(gumballMachine);
		gumballMachineMonitor.report();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		gumballMachineMonitor.report();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		gumballMachine.refill(10);
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
	}
}
