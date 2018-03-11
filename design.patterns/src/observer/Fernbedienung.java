package observer;

import java.util.Observable;

public class Fernbedienung extends Observable {
	
	private Integer channel;
	private Integer oldChannel;
	
	public void switchChannel(Integer channel){
		
		System.out.println("channel: " + this.getChannel());
		this.setChannel(channel);
		this.setChanged();
		System.out.println("Haschanged: " + this.hasChanged());
//		System.out.println("channel: " + this.getChannel());
	
//		System.out.println(this.hasChanged());
		this.notifyObservers(this.getOldChannel());

		//System.out.println("channel is: " + this.getChannel());	
		System.out.println("Haschanged: " + this.hasChanged());
		System.out.println("---------------------");
	}
	
	public Integer getChannel() {
		return channel;
	}
	
	public Integer getOldChannel() {
		return oldChannel;
	}

	public void setChannel(Integer channel) {
		if (getChannel() != null){
			oldChannel = getChannel();
		} 
		this.channel = channel;
	}
	
	
	
	
}
