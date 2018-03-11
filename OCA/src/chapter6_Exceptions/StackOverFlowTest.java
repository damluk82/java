package chapter6_Exceptions;

public class StackOverFlowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackOverFlowTest.hal(5);
	}
	
	static void hal(int a){
		hal(1);
	}
}
