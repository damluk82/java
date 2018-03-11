package generics.test;

public class WithGenerics<T> {

	private T t;
	
	public WithGenerics(){}
	
	public WithGenerics(T t) {
		if (t instanceof Foo){
			this.t = t;
		} else {
			throw new IllegalArgumentException("Please add a valid argument");
		}
	}


	public static void main(String[] args) {

		
		WithGenerics<Foo> a = new WithGenerics<>(new Foo());
		System.out.println(a.getClass());
	}

}
