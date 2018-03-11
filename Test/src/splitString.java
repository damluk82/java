
public class splitString {

	
	public static final String hal = "mi|ez|te:ez|egy|szar";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] t = hal.split("");
		String[] halArr = hal.split("\\:");
		String[] a = halArr[0].split("\\|");
		String[] b = halArr[1].split("\\|");
		
		
		
		for (String i : t){
			System.out.println(i);
		}
		
		for (String i : b){
			System.out.println(i);
		}
		
	}

}
