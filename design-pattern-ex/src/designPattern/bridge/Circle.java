package designPattern.bridge;

public class Circle extends Shape {

	private final double x,y,radius;
	
	public Circle(double x,double y, double radius, DrawingAPI api){
		super(api);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		drawingAPI.drawCircle(x, y, radius);
	}

}
