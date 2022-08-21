package pattern;

public class ShapeFactory {

	IShape getShape(String shape) {
		switch (shape) {
		case "circle":
			return new Circle();
		case "rectangle":
			return new Rectangle();
		default:
			return null;
		}
	}
}
