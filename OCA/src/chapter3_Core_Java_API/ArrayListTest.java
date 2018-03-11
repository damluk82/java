package chapter3_Core_Java_API;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList();
		
		a.add("haha");
		a.add(Integer.toString(5));
		a.add(0, "haha2");
		System.out.println(a.toString());
		Collections.sort(a);
		
		System.out.println(a);
		

		
		
	}

}
