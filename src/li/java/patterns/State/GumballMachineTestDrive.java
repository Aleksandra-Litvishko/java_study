package li.java.patterns.State;

public class GumballMachineTestDrive {
	public static void main(String [] args) {
		GumballMachine gumballMachine = new GumballMachine("Chernyshevskaya st.50",5);
		GumballMachineMonitor gumballMachineMonitor = new GumballMachineMonitor(gumballMachine);
		gumballMachineMonitor.report();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		gumballMachineMonitor.report();
		
//		System.out.println(gumballMachine);
//		
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.ejectQuarter();
//		
//		System.out.println(gumballMachine);
//		gumballMachine.insertQuarter();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		
//		System.out.println(gumballMachine);
	}
}
