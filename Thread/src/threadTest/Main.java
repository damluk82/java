package threadTest;

import java.time.Duration;
import java.time.LocalTime;

public class Main{

private int tt;

	public static void main(String[] args) throws InterruptedException {
		
		
		LocalTime time = LocalTime.now();
		
		System.out.println(time);
		
		Thread.sleep(1000);
		
		LocalTime time2 = LocalTime.now();
		
		System.out.println(time2);
		
		System.out.println("duration: " + Duration.between(time, time2));
		
		
		
//		Hal hal1 = new Hal();
		
		Main main = new Main();
		main.miez();
		
//		Thread t1 = new Thread(hal1);
//		Thread t2 = new Thread(hal1);
//		t1.s1tart();
		//t2.start();
//		
		
//		try {
//			Thread.sleep(6000);
//			System.out.println("Main Thread awake");
//			t1.interrupt();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		
		
	}
	
	public void miez(){
		
		Runnable runnable = new Runnable(){public void run(){
			
			
			for (int ij=0;ij<200000;ij++){
				count();
			}
		}};
		
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("tt :" + tt);
		
	}
	
	public synchronized void count(){
		this.tt++; 
	}
	
}	
	
class Hal implements Runnable {
 
	private int number = 0;
	
	public void count(int i){
		this.number += i; 
	}
	
	public void run() {
		
		for (int i=0; i<10; i++){
			System.out.println(i);
			count(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Sorry but thread has been interrupted");
			}	
		}
		System.out.println("Number is: " + number);
	}
}
