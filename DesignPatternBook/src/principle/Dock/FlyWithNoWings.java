package principle.Dock;

public class FlyWithNoWings implements FlyyableBehavior {

	@Override
	public void flyDock() {
		// TODO Auto-generated method stub
		System.out.println("I can't fly. ");
	}
	
	public void turnOn() {
		System.out.println("I can turn my eyes on !!");
	}

}
