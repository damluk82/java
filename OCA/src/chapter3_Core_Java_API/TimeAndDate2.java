package chapter3_Core_Java_API;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimeAndDate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		LocalTime time = LocalTime.now();
//		LocalDate date = LocalDate.now();
		
//		System.out.println(time);
//		
//		System.out.println(LocalDate.now());
//		
//		System.out.println(LocaledateTime(date, LocaleTime(12,12)));
//		
//		time = time.of(12, 21);
		
		
//		LocalDate     date = LocalDate.of(2020, Month.JANUARY, 20);
//		LocalTime 	  time = LocalTime.of(5, 15);
//		LocalDateTime dateTime = LocalDateTime.of(date, time);
//				
//		
//		DateTimeFormatter format1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
//		
////		System.out.println(date.format(format1));
//		System.out.println(format1.format(date));
				
		
		
//		int a = 1;
//		int b = 2;
//		boolean bool = true;
//		char c = 'c';
//		
//		String hal = a + 1 + "";
//		hal.contains("a");
//		System.out.println(hal);
		
		String [] array = {"1",   "20A2", "20A6", "206", "1A", "FF5", "FF3", "FF333", "10A",};
//
//		Arrays.sort(array);
//	
//		System.out.println(Arrays.toString(array));
		
		TimeAndDate2 aaaa = new TimeAndDate2();
		
		String a = "hal";
		String b = new String(a);
		String c = new String("hal");
		StringBuilder sb = new StringBuilder(c);
		Integer in = new Integer(1);
		Boolean bb = new Boolean(true);
		int egy = 1;
		float egyf = 1.0f;
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(b.equals(c));
		System.out.println("hal".equals( c));
		System.out.println("hal" == a);
		System.out.println(a.equals(sb));
		System.out.println(in.equals(aaaa));
		System.out.println(egy == in);
		System.out.println(egyf == in);
//		System.out.println(sb.charAt(3));
		a += 'c';
		a += true;
		String fff = "eg";
		System.out.println(fff + 'c' + true);
		String fff2 = "egy";
		System.out.println(fff.equals("egy"));
		System.out.println(fff == "egy");
		
		Object [] sdgf = new Object [0];
		
		System.out.println(sdgf.length);
		System.out.println(fff.length());
		
//		sdgf[0][0][0] = new String("a");
		
		
//		System.out.println(a == "halctrue");
//		System.out.println(a);
		
		
		int [] ezegy = {1,2,3};
		int [] ezegy2 = {1,2,3};
		ArrayList<Integer> arra = new ArrayList<>();
		ArrayList<Integer> arra2 = new ArrayList<>();
		ArrayList<Integer> arra3 = new ArrayList<>();
		arra.add(100);
		arra2.add(100);

		
		System.out.println(ezegy == ezegy2);
		System.out.println(ezegy.equals(ezegy2));
		System.out.println(arra == arra2);
		System.out.println(arra.equals(arra2));
		
		System.out.println(Arrays.binarySearch(array, "20A2"));
		
		List faszomat = new ArrayList<>();
		
		faszomat.add(Boolean.TRUE);
		faszomat.add(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
		
		
		int [][] hal = {{1,2}, {3,6}};
		
		
//		toArray
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(new Integer(1));
		
		Integer [] halak = list.toArray(new Integer[1]);
		
		for(Integer i : halak){
			
			System.out.print(i + ", ");
			
		}
		
		
		StringBuilder sb1 = new StringBuilder(1);
		
		System.out.println("sb1 " + sb1.length());
		System.out.println("sb1 " + sb1.capacity());
		
		System.out.println("dd" + "hal".substring(3,3));
		

		
		Byte gg = new Byte((byte)2);
		
		System.out.println(gg.byteValue());
		
		
		List <Integer> listt = new ArrayList<>();
		listt.add(10);
		listt.add(20);
		System.out.println("size " +listt.size());
		
		Integer [] $$the2 = new Integer [10];
		
//		 Integer [] 
				 $$the2 = listt.toArray(new Integer[1]);
		
		for (Integer j : $$the2){
			
			
			System.out.println($$the2.length + " "  + j);
			
		}
		
		List <Integer> list10 = new ArrayList<>();
		
		list10 = Arrays.asList($$the2);
		
		System.out.println("aslist: "  + list10);
		
		System.out.println(new StringBuilder("0123456").replace(2,5,"ABCD"));
		
		System.out.println('b'+0);
		
		
		
		
		
		
				 
		
		
	}
	
	

}
