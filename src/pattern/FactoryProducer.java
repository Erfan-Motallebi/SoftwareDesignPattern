package pattern;

public class FactoryProducer {

	public static AbstractFactory getFactory(Boolean rounded) {
		if (rounded) {
			return new RoundedFactory();
		} else {
			return new ShapeFactory();
		}
	}
}
