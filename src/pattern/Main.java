package pattern;

public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		IShape rect = shapeFactory.getShape("Rectangle".toLowerCase());
		rect.draw("Rectangle");

	}

}
