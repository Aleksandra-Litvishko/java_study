package li.java.patterns.Adapter;

public class WildTurkey implements Turkey {
	public void gobble() {
		System.out.println("Gooble gobble");
	}
	
	public void fly() {
		System.out.println("I'm flying a short distance");
	}
}
