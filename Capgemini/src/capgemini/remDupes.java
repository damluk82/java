package capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remDupes {

	public static void main(String[] args) {
		
		List<String> ttt = new ArrayList<>(Arrays.asList("egy", "egy", "ketto", "negy", "negy")); 
		List<String> ttt2 = new ArrayList<>(Arrays.asList("hat", "egy", "egy", "egy", "ketto", "negy", "egy", "negy", "hat"));
		
		for (Object o: removeDupes(ttt2)) {
			System.out.println(o);
		}
		
	}
	
	public static List<Object> removeDupes(List<? extends Object> list){
		
		List<Object> lista = new ArrayList<>(list);
		
		for (int j=0; j<list.size(); j++ ){
			Object item = list.get(j);
			
			for (int h=j+1;h<list.size(); h++ ){
				Object item2 = list.get(h);
				
				if (item.equals(item2)){
					list.remove(item2);
					h--;
				}
				System.out.println(list);
			}
		}
//		return new ArrayList<Object>();
		return (List<Object>) list;
	}

}
