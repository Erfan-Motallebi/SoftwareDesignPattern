package pattern;

public class Rectangle implements IShape {
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw(String name) {
		System.out.println("Shape: " + name);
		
	}
}
