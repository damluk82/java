package inner.demo;

public class InnerTest {
	
	int instance = 1;
	static int stat = 2;
	
	public class Inner1 {
		int a = 1;
	}
	
	public static class Inner2 {
		static int a = 2;
	}
	
	public static void main(String[] args) {
		InnerTest outer = new InnerTest();
		
		Inner1 inner1 = outer.new Inner1();
		Inner2 inner2 = new Inner2();
		
		System.out.println(inner1.a + stat);
		System.out.println(inner2.a /*+ instance*/);	
	}
}
