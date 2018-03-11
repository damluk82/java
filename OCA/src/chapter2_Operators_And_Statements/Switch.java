package chapter2_Operators_And_Statements;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 111;

		switch (x) {

		case 0: case 10: case 11:
			System.out.println("x is 0, or 10, or 11");

		case 1: case 55: case 3:
			System.out.println("x is 1");
			
		default:
			System.out.println("haha");

			
//			int dayOfWeek = 5;
//			switch(dayOfWeek) {
//			case 0:
//			System.out.println("Sunday");
//			default:
//			System.out.println("Weekday");
//			case 6:
//			System.out.println("Saturday");
//			break;
			



		}
	}
}
