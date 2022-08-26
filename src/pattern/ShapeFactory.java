package pattern;

public class ShapeFactory extends AbstractFactory {
	@Override
	Shape getShape(String shape) {
		switch (shape.toLowerCase()) {
		case "rectangle":
			return new Rectangle();
		case "square":
			return new Square();
		default:
			return null;
		}
	}
}
