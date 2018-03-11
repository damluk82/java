package chapter6_Exceptions;

public class FullExceptions {

	public static void main(String[] args) {
		exceptions();
		
	}
	
	
	public static void exceptions() {
		String result = "";
		String v = null;
		try {
			try {
				result += "before";
				v.length();
				result += "after";
			} catch (NullPointerException e) {
				result += "catch";
				throw new RuntimeException();
			} finally {
				result += "finally";
				throw new Exception();
			}
		} catch (Exception e) {
			result += "done";
		}
		System.out.println( result);
	}

}
