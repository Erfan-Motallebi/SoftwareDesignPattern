package principle.Dock;

public class RubberDock extends Dock {

	public RubberDock() {
		// TODO Auto-generated constructor stub
		flyBehavior = new FlyWithNoWings();
		quackBehavior = new QuackNoWay();
	}

	@Override
	void display() {
		// TODO Auto-generated method stub

	}

	@Override
	void swim() {
		// TODO Auto-generated method stub

	}

}
