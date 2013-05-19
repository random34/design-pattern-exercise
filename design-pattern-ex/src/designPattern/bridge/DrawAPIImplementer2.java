package designPattern.bridge;

public class DrawAPIImplementer2 implements DrawingAPI {

	@Override
	public void drawCircle(double x, double y, double radius) {
		String format = "[DrawAPIImplementer2] x= %f y=%f radius=%f";
		System.out.println(String.format(format, x,y,radius));
	}

}
