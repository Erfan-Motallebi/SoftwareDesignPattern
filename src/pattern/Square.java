package pattern;

public class Square implements Shape {

	@Override
	public void draw(String shapeTitle) {
		System.out.println("This is a " + shapeTitle);
	}

}
