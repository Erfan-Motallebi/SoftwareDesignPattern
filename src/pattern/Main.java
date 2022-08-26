package pattern;

public class Main {

	public static void main(String[] args) {

			try {
//				Rounded Factory triggering
				AbstractFactory roundedFactory = FactoryProducer.getFactory(true);
				Shape roundedRect = roundedFactory.getShape("Rectangle");
				Shape roundedSquare = roundedFactory.getShape("Square");

//				Normal Factory Triggering
				AbstractFactory normalFactory = FactoryProducer.getFactory(false);
				Shape normalRect = normalFactory.getShape("Rectangle");
				Shape normalSquare = normalFactory.getShape("Square");

//				Printing all the results

				roundedRect.draw("Rounded Rectangle");
				roundedSquare.draw("Rounded Square");

				
				normalRect.draw("Rectangle");
				normalSquare.draw("Square");
			} catch (NullPointerException e) {
				// TODO: handle exception
				System.err.println("Error found : " + e.getMessage());
				System.err.println("The trace : " + e.getStackTrace()) ;
			}
	}

}
