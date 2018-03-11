package generics.test;

public class WithoutGenerics {

	private Foo foo;
	
	public WithoutGenerics(Foo foo){
		this.foo = foo;
	}
	
	
	public static void main(String[] args) {
		
		WithoutGenerics a = new WithoutGenerics(new Foo());
		
		a.foo.hal();
		
		
	}

}
