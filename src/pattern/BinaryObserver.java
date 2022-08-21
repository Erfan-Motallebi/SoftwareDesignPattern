package pattern;

public class BinaryObserver extends Observer {
	
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	void update() {
		System.err.println("BinaryObserver : " + this.subject.getState());
		
	}

}
