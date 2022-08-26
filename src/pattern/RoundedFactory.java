package pattern;

public class RoundedFactory  extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		switch (shape.toLowerCase()) {
		case "rectangle":
			return new RoundedRectangle();
		case "square":
			return new RoundedSquare();
		default:
			return null;
		}
	}

}
