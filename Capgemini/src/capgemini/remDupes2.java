package capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class remDupes2 {

	public static void main(String[] args) {
		
		List<String> ttt = new ArrayList<>(Arrays.asList("egy", "egy", "ketto", "negy", "negy")); 
		List<String> ttt2 = new ArrayList<>(Arrays.asList("hat", "egy", "egy", "egy", "ketto", "negy", "egy", "negy", "hat"));
		
		for (Object o: removeDupes(ttt2)) {
			System.out.println(o);
		}
	}
	
	public static List<Object> removeDupes(List<? extends Object> list){
		
		List<Object> lista = new ArrayList<Object>();
	
		Iterator<? extends Object> it = list.iterator();
	
		while (it.hasNext()){
			Object item = it.next();
			if (!lista.contains(item)){
				lista.add(item);
			}	
		}
//		return new ArrayList<Object>();
		return lista;
	}

}
