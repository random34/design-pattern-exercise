package designPattern.bridge;

/**
 * <p>recognizeable by creational methods <i>taking an instance</i> of different
 * abstract/interface type and returning an implementation of own
 * abstract/interface type which delegates/uses the given instance</p>
 * 
 * <p>Similar to Strategy and template</p>
 * 
 * @author laiq
 *
 */
public class BridgePatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape [] shapes = {
			new Circle(10,11,1, new DrawAPIImplementer1()),
			new Circle(9,10,2, new DrawAPIImplementer2())
		};
		
		for (Shape s:shapes){
			s.draw();
		}
	}

}
