package pattern;

public class Main {

	public static void main(String[] args) {
		
		Subject subjectOne = new Subject();
		
		BinaryObserver binaryObserver =  new BinaryObserver(subjectOne);
		HexObserver hexObserver =  new HexObserver(subjectOne);
		
		subjectOne.detach(hexObserver);
		
		subjectOne.setState(35);
		
		
	}

}
