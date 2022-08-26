package pattern;

public class FactoryProducer implements IFactoryProducer {
	
	
	 public AbstractFactory getFactory(String shape) {
		if (shape.toLowerCase() == "rounded") {
			return new RoundedFactory();
		}
		if (shape.toLowerCase() == "normal") {
			return new ShapeFactory();
		}
		return null;
	}
}
