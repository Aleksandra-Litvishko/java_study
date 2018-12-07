package li.java.patterns.PatternsTogether;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
	ArrayList quackers = new ArrayList();
	ArrayList observables = new ArrayList();
	int i = 0;

	public void quack() {
		Iterator iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.quack();
			quacker.notifyObservers();
		}
	}

	public void addDuck(Quackable quacker) {
		quackers.add(quacker);
		Observable observable = new Observable(quacker);
		observables.add(observable);
	}

	@Override
	public void registerObserver(Observer observer) {
		Iterator iterator = observables.iterator();
		while (iterator.hasNext()) {
			Observable observable = (Observable) iterator.next();
			observable.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {
		i = quackers.indexOf(this);
		Observable iObservable = (Observable) observables.get(i);
		iObservable.notifyObservers();
		}
	}