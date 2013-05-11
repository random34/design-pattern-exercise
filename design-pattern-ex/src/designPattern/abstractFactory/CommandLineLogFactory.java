package designPattern.abstractFactory;

public class CommandLineLogFactory implements AbstractLogFactory {

	@Override
	public Logger getLogger() {
		// TODO Auto-generated method stub
		return new CommandLineLogger();
	}

}
