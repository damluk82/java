package chapter6_Exceptions;

public class ExceptionExamples {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
//		try {
//			arthimet(1);
//		} catch (ArithmeticException e) {
////			System.out.println("Arthimetic Exception van");
//			e.getStackTrace();
//			throw new RuntimeException("ez beszart");
//		} catch (RuntimeException e) {
//			// TODO: handle exception
//			e.getMessage();
//		}
		
		test();
		
		
	}
	
	public static void test() throws ArithmeticException{
		
		arthimet(10);
		
	}
	

	public static void arthimet(int c) {
		
		int hal = c / 0;
		
	}
	
	
}
