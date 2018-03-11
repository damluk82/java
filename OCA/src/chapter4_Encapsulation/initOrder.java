package chapter4_Encapsulation;

public class initOrder {
	
		
		{
			System.out.printf("instance init \n");
		}
		
		public static initOrder a = new initOrder();
		
		static {
			System.out.printf("static init \n");
		}
		
		public static void main(String[] args) {
			System.out.printf("kurva anyad \n");
		}
	
	
}
