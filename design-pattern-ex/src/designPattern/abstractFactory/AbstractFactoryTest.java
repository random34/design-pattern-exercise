package designPattern.abstractFactory;

/**
 * <p>The <b>abstract factory</b> pattern is a software creational design pattern that
 * provides a way to encapsulate a group of individual factories that have a
 * common theme without specifying their concrete classes.</p>
 * <p>recognizeable by creational methods returning the factory itself which in
 * turn can be used to create another abstract/interface type</p>
 * @author laiq
 *
 */
public class AbstractFactoryTest {

	public static void main(String[] args){
		AbstractLogFactory factory = getLogFactory("command");
		Logger logger = factory.getLogger();
		logger.log("log message");
	}
	
	public static AbstractLogFactory getLogFactory(String info){
		if ("command".equals(info)){
			return new CommandLineLogFactory();
		}else{
			return new RemoteLogFactory();
		}
	}
}
