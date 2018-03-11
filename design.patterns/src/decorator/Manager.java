package decorator;

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractTV tv = new DecoratedTV(new SimpleTV());
		
//		tv.turnOn();
		tv.turnOff();
		
	}

}
