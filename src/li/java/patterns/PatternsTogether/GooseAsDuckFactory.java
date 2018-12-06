package li.java.patterns.PatternsTogether;

public class GooseAsDuckFactory extends AbstractGooseFactory {
	
	public Quackable createGoose() {
		return new GooseAdapter(new Goose());
	}
}
