package inner.demo;

public class Outer {
	
	static class Inner2{}
	
	public class Inner1 {
		
		private void show(){
			System.out.println("show me the private inner");
		}
		
		public void me(){
			show();
		}
	}
	
	public void getMe(){
		Inner1 inner = new Inner1();
		inner.me();
	}
	
	private int hal = 4;
	
	public int getHal() {
		return hal;
	}

	public void setHal(int hal) {
		this.hal = hal;
	}
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		Outer.Inner1 inner1 = outer.new Inner1();
		inner1.show();
		
	}	
}


