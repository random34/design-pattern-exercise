package designPattern.abstractFactory;

public class RemoteLogFactory implements AbstractLogFactory {

	@Override
	public Logger getLogger() {
		// TODO Auto-generated method stub
		return new RemoteLogger();
	}

}
