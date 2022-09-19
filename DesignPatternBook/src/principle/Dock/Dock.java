package principle.Dock;

public abstract class Dock {

	// HAS-A Relationship [ Aggregation ]
	protected FlyyableBehavior flyBehavior;
	protected QuackableBehavior quackBehavior;

	abstract void display();

	abstract void swim();

//	Concrete Methods - Encapsulates
	void performFly() {
		flyBehavior.flyDock();
	}

	void performQuack() {
		quackBehavior.quack();
	}

//	Dynamic Dock Fly Option
	public void setFlyBehavior(FlyyableBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackableBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
