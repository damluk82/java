package chapter6_Exceptions;

import javax.management.RuntimeErrorException;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			hal();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally");
		}
		
	}
	
	
	static void hal() throws RuntimeException{
//		throw new RuntimeErrorException(null);
	}

}
