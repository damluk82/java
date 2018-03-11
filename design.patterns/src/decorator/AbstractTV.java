package decorator;

public abstract class AbstractTV implements TV {
	
	protected TV tv;
	
	public AbstractTV(TV tv){
		this.tv = tv;
	}
	
	@Override
	public void turnOn() {
		tv.turnOn();
	}

	@Override
	public void turnOff() {
		tv.turnOff();
	}

}
