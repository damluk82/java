package chapter1_Building_Java_Blocks;

public class StaticVariable {

	static int _;
	
	public static void main(String[] args) {
		long aa = 5_555_555_555_555_555_555L;
		int x=0b1010100101;
		System.out.println(aa);
		long hexWords = 0xCAFE_BABE;
		System.out.println(hexWords);
		
	}
	
	public void StaticVariable(){
		
	}

	public void testing() {

		final int a;
	}

	public static int MAX_kurva = 5;
	public int kurva;

	public void grow(int inches) {
		if (kurva < MAX_kurva) {
			int newSize = kurva + inches;
			kurva = newSize;
		}
	}
}
