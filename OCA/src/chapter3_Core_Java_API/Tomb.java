package chapter3_Core_Java_API;

import java.util.ArrayList;
import java.util.Arrays;

public class Tomb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int[] numbers = new int[10];
//		for (int i = 0; i < numbers.length; i++){
//			
//			numbers[i] = i + 5;
//			System.out.println(numbers[i]);
//			
		
		int i = 1;
			
		String[] strings = { "c", "a", "b" };
		System.out.println(strings[0]);
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));
		
		System.out.println(Arrays.binarySearch(strings, "a"));
		
		System.out.println(strings[0]);
		
		System.out.println(strings);
		
		
		
		
		
	}
		
	}

