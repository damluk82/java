package chapter1_Building_Java_Blocks;

public class Scope1 {

	int a;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		static int ddd;
		Scope1 s1 = new Scope1();
		
		s1.range();
	}

	public void range(){
		

		
		if (0<1){
			int a;
			a = 1;
			System.out.println("in the if a: " + a);
			System.out.println("in the if this.a: " + this.a);
		}
		
		System.out.println("Outer a: " + a);
		
	}
}
