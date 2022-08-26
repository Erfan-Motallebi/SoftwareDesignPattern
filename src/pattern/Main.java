package pattern;

public class Main {

	public static void main(String[] args) {

		FactoryProducer factoryProducer = new FactoryProducer();

//		Rounded Factory triggering
		AbstractFactory roundedFactory = factoryProducer.getFactory("Rounded");
		roundedFactory.getShape("Rectange");
		roundedFactory.getShape("Square");

//		Normal Factory Triggering
		AbstractFactory normalFactory = factoryProducer.getFactory("");
		normalFactory.getShape("Rectange");
		normalFactory.getShape("Square");

	}

}
