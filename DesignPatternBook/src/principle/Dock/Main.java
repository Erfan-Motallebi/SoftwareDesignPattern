package principle.Dock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallardDock mlDock = new MallardDock();
		mlDock.performFly();
		
		RubberDock rDock = new RubberDock();
		rDock.performFly();
		
		rDock.setFlyBehavior(new FlyWithWings());
		rDock.performFly();
	}

}
