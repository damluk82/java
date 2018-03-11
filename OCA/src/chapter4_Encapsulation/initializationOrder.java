package chapter4_Encapsulation;

public class initializationOrder {

		    {
		        System.out.printf("NON-STATIC BLOCK\n");
		    }

		    public static initializationOrder a = new initializationOrder();
		    
		    static{
		        System.out.printf("STATIC BLOCK\n");
		    }
		    
		    public static void main(String[] args) {

			}
		    
}
