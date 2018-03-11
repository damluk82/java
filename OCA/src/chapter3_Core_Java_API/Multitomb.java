package chapter3_Core_Java_API;

public class Multitomb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hal[][] = new String[][] { { "egy", "ketto", "harom" }, { "negy", "ot" }, { "hat", "het" } };

//		for (String[] i : hal) {
//			for (String j : i)
//				System.out.print(j + " ");
//			System.out.println("");
//		
		
			for (int i=0;i<hal.length; i++){
				for (int j=0;j<hal[i].length; j++)
					System.out.print(hal[i][j] + " ");
				System.out.println("");
				
			}
			
			System.out.println(hal);

		
		}
}


