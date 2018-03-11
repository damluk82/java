package dog;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("kedvencFank", "Black Sensation");
		
		Bernathegyi b = new Bernathegyi();
		Chivava c = new Chivava();
		
		dog d1;
		
		d1 = b;
		dog d2 = new dog();
		
//		d3 = new dog();
		
//		System.out.println(b.getName());
//		System.out.println(c.getName());
//		System.out.println(d1.getName());
//		System.out.println(d2.getName());
//		System.out.println(d3.getName());
		b.eat();
		d2.eat();
		
		
		
		
		
	}

}
