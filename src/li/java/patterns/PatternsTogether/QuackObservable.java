package li.java.patterns.PatternsTogether;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
