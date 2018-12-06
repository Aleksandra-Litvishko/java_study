package li.java.patterns.PatternsTogether;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
	ArrayList quackers = new ArrayList();
	ArrayList observables = new ArrayList();

	public void quack() {
		Iterator iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.quack();
		}
	}

	public void addDuck(Quackable quacker) {
		quackers.add(quacker);
	}

	public void removeDuck(Quackable quacker) {
		quackers.remove(quacker);
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}
}
