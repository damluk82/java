package chapter5_Class_Design;

public class Kacsa extends Hal {

	public static boolean isBiped() {
		return true;
	}

	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: "); //+ isBiped());
	}

	public static void main(String[] args) {
		
		Hal joey = new Kacsa();
		
		joey.getMarsupialDescription();
		
//		joey.getKangarooDescription();
		joey.getMarsupialDescription();
	}

}
