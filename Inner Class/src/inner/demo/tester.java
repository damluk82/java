package inner.demo;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer outer = new Outer();
		
		System.out.println( outer.getHal());
		
		outer.getMe();
		
		Outer.Inner1 inner = outer.new Inner1();
		
		inner.me();
	}

}
