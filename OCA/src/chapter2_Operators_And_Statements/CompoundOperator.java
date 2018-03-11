package chapter2_Operators_And_Statements;

public class CompoundOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte myByte1 = 1;
		byte myByte2 = 1;
		byte myByte3 = 1;
		
		myByte2 = (byte)(myByte2 + myByte1);
		
		int a = 7;
		long b = 111L;

		int c = (int) (a + b);

		short x = 14;
		float y = 13;
		double z = 30;

		boolean yff = false;
		boolean zoli = true;

		if (true) {

			// System.out.println(++z);
			// System.out.println(++y);

			// } else {
			//// System.out.println(z += 10);
			//// System.out.println(y += 10);
			// }
			System.out.println("x: " + x + "  y: " + y);
			System.out.println(zoli == true ? x++ : y++);
						
			System.out.println("x: " + x + "  y: " + y);
			

			System.out.println("x is: " + x + "   " + "y is: " + y + "   " + "zoli is: " + zoli);

			if (yff != zoli) {
				// System.out.println("not equals");

			}

			zoli = (yff != true);

			boolean kurva = !true;

			// System.out.println(yff == true);

		}
	}
}
