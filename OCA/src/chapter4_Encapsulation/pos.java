package chapter4_Encapsulation;

public class pos {

	static String king;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pos pos = new pos();
	}
	
	pos(){
//		new pos(10);
		this(10);
	}
	
	pos(int a){
		System.out.println("int is: " + a);
	}

}
