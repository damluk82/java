package collection.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> a = 
				new HashSet<String>(Collections.singleton(new String("a")));
		
		Iterator<String> iterator = a.iterator();
		
		int count=0;
		while (iterator.hasNext()){
			iterator.next();
			count++;
			
		}
		System.out.println(count);
		
		List<String> list = new ArrayList<>();
		
		list.addAll(a);
		list.addAll(a);
		list.addAll(a);
		
		System.out.println(list.size() + " " +  a);
		
		list.removeAll(a);
		
		System.out.println(list.size() + " " +  a);
		
	}

}
