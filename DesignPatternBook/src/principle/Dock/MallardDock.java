package principle.Dock;

public class MallardDock extends Dock {
	
	
	public MallardDock() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new QuackAmaze();
	}

	@Override
	void swim() {
		// TODO Auto-generated method stub

	}

	@Override
	void display() {
		// TODO Auto-generated method stub

	}

}
