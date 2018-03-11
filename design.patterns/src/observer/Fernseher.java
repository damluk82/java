package observer;

import java.util.Observable;
import java.util.Observer;

public class Fernseher implements Observer {

	@Override
	public void update(Observable o, Object arg1) {
		Fernbedienung f = (Fernbedienung)o;
		
		if (arg1 != null) {
			System.out.println("Old channel is: " 
								+ arg1
								+ " New channel is: " 
								+ f.getChannel());
		} else {
		
		
		System.out.println("There is no old channel. " 
						   + "The new channel is: " 
						   + f.getChannel());
//		System.out.println("The update value is: " + arg1);
		}

	}


	
	

}
