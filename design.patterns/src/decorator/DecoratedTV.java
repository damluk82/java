package decorator;

public class DecoratedTV extends AbstractTV {

	public DecoratedTV(TV tv) {
		super(tv);
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		super.turnOn();
		setupVolume();
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		checkOtherChanels();
		super.turnOff();
		
	}
	
	public void setupVolume(){
		System.out.println("Volume is set up!");
	}
	
	public void checkOtherChanels(){
		System.out.println("Other channels has been checked!");
	}
	
	

	
	
	
}
