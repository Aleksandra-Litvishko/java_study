package li.java.patterns.PatternsTogether;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
	ArrayList quackers = new ArrayList();

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

	@Override
	public void registerObserver(Observer observer) {
		Iterator iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {
		}
	}