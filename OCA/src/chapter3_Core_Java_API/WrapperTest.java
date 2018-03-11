package chapter3_Core_Java_API;

import java.util.ArrayList;
import java.util.List;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Byte b = new Byte((byte)'1');
		Long a = new Long(100);
		Integer integer1 = new Integer(12); 
		
		System.out.println(integer1 -10);
				
		a=100000000000000000L;
		
		float c = a.floatValue();
		
		System.out.println(c);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		System.out.println(numbers.remove(1));
		System.out.println(numbers);
		
		List<WrapperTest> wpt = new ArrayList<>();
		
		wpt.add(new WrapperTest());
		wpt.add(new WrapperTest());
		System.out.println(wpt.remove(1));
		System.out.println(wpt.set(0, new WrapperTest()));
		
	}

}
