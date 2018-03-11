package chapter3_Core_Java_API;

public class StringTest {

	String b = "_";
	String b2 = "_"; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String f = "Fluffy";
		
//		System.out.println(f.charAt(6));
		
		System.out.println("abc".replace("a", "ddddd").contains("dd"));
		
//		System.out.println("abcabc".replace('a', "Ac"));
		
		
		StringBuilder ss = new StringBuilder(f);
		StringBuilder ss2 = new StringBuilder(f);
		System.out.println("charAt: " + ss.charAt(5));
		
		StringTest st = new StringTest();
		st.halasto();
		
		 String x = "Hello World";
         String y =  new String("Hello World");
         System.out.println("ha == " + (x == y));
         System.out.println("ha eq " + (x.equals(y)));
         System.out.println((new String("test") == new String("test")));

		
		
		System.out.println("equals? " + ss.equals(ss2));
		System.out.println("equals? " + (ss == ss2));
		
		
		
		System.out.println(ss.capacity());
		
		ss.insert(6, f);
		
		System.out.println(ss);
		
		f = f.replace('F', '2').replace("2", "3");
		
		System.out.println(ss.capacity());
		
	}
	
	public void halasto(){
		
		
		System.out.println("Halastó:" +  b.equals(b2));
		
		
		String a = "abc";
		StringBuilder c = new StringBuilder("abc");
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace('C', '3');
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("a equals c " + a.equals(c));
		

	}
	

}
