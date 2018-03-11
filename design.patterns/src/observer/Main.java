package observer;

public class Main {
	
	public static void main(String[] args) {
	
		Fernbedienung tavkapcs = new Fernbedienung();
		Fernseher tv = new Fernseher();
		
		tavkapcs.addObserver(tv);
		
//		System.out.println("Observers: " + tavkapcs.countObservers());
		tavkapcs.switchChannel(5);
		tavkapcs.switchChannel(1);
		
		
		
	}
	
	
	
	
}
