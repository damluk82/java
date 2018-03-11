package chapter2_Operators_And_Statements;

public class Equality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 7;
		Integer b = new Integer("7");
		
		String s1 = "hal";
		String s2 = new String("hal");
		
		System.out.println("------String------");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		
		System.out.println("------Integer------");
		
		System.out.println(a == b);
		System.out.println(b.equals(a));
        
	}

}
