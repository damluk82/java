package collection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("hal");
		list.add("miez");
		list.add("hal");
		
		ListIterator<String> li = list.listIterator();
	
		
		System.out.println(list.size());
		
		list.removeAll(Collections.singleton("hal"));
		
		Set set = Collections.singleton("hal");
		
		System.out.println("Set: " + set.size());
		
		//System.out.println(list.size());
		
		
		while(li.hasPrevious()){
			//Object o = listiter.next();
			System.out.println("Next index: " + li.previous().toString());
			//System.out.println(o + " miezte");
		}
		
		
	}

}
