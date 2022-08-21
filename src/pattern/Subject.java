package pattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> obsevers = new ArrayList<Observer>();
	private int state;
	
	public int getState() {
		return this.state;
	}


	public void setState(int state) {
		this.state = state;
		this.notifyAllObservers();
	}


	void attach(Observer observer ) {
		this.obsevers.add(observer);
	}
	
	
	void detach(Observer observer) {
		this.obsevers.remove(observer);
	}
	
	void notifyAllObservers() {
		for (Observer observer : obsevers) {
			observer.update();
		}
	}
}
