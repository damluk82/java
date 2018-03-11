package chapter2_Operators_And_Statements;

public class Switch2 {

	final static String alap1 = "hal";
	final static String halak1 = "kurvaélet";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 11;
		
		switch (x) {

		case 0: case 10: case 11:
			System.out.println("x is 0, or 10, or 11");

		case 1:
		case 55:
		case 3:
			System.out.println("x is 1");

		default:
			System.out.println("haha");

			System.err.println("miii?");
			// int dayOfWeek = 5;
			// switch(dayOfWeek) {
			// case 0:
			// System.out.println("Sunday");
			// default:
			// System.out.println("Weekday");
			// case 6:
			// System.out.println("Saturday");
			// break;

			Switch2 aa = new Switch2();

			aa.hal("hal", alap1);

		}

	}

	public void hal(String hh, final String alap) {

		
		final String $ = "zzz" ;
		
		switch (alap) {
		case $:

			break;
		case halak1:
		default:
			break;
		}

	}

	
}
