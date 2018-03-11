package threadTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadInterference {

	 List<String> list = new ArrayList<>();
	
	 List<String> syncList = Collections.synchronizedList(list);
		
	public static void main(String[] args) {
	
		ThreadInterference myClass = new ThreadInterference();
		
		Thread t1 = new Thread(new Runnable() {
		    public void run() {
		    	myClass.addToList(myClass.syncList);
		}});
		
		Thread t2 = new Thread( new Runnable() {
			public void run(){
				myClass.removeFromList(myClass.syncList);
		}});
		
		t1.start();
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
	
	public void addToList(List<? extends Object> list){
		
		String threadName = Thread.currentThread().getName();
		
		for (int i=0; i<10; i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(threadName 
							+ " size is: " + list.size());
			this.list.add("Kovi");
		}	
	}
	
	public void removeFromList(List<? extends Object> list){
		
		String threadName = Thread.currentThread().getName();
		
		for (int i=0; i<10; i++){
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(threadName 
							+ " size is: " + list.size());
			if (this.list.size() > 0)
			this.list.remove(list.size()-1);
			
		}
		
	} 
	
	public void getLenght(){
		
		System.out.println(this.list.size());
		
	}

}
