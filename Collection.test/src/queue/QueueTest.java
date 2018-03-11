package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue = new LinkedList<>();
		
		queue.add("egy");
		queue.add("ketto");
		queue.add("harom");
		
		System.out.println(queue.element()); 
		System.out.println(queue);
		
		//System.out.println(queue.peek());
//		System.out.println(queue.poll());
//		System.out.println(queue.offer("egy"));
		//System.out.println(queue.element());
		//System.out.println(queue);
		
		
		
	}

}
