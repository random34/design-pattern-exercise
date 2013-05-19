package designPattern.bridge;

public abstract class Shape {
	protected DrawingAPI drawingAPI;
	
	protected Shape(DrawingAPI api){
		drawingAPI = api;
	}
	
	public abstract void draw();
}
