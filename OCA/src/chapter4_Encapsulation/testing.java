package chapter4_Encapsulation;

public class testing {

	static int hal;
	static final int te = 7;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StringBuilder name = new StringBuilder("a");
//		StringBuilder name2 = name;
//		name2.append("a");
//		
//		System.out.println(name);
//		System.out.println(name2);
		
		testing t1 = new testing();
		
//		System.out.println(t1.hal);
//		t1.fasz();
		
//		t1 = null;
		
//		System.out.println(t1.hal);
//		t1.fasz();
		
		final int alap = 7;
		
		int[][] differentSize = {{1, 4}, {}, {9,8,7}};
				
//		for (int i[] : differentSize){
//			for (int j : i){
//				System.out.print(j + " ");
//			}
//		System.out.println(" ");}
		
		for (int i=0; i<differentSize.length;i++){
			for (int j=0; j<differentSize[i].length ;j++){
				
				System.out.print(differentSize[i][j] + " ");
			}
			System.out.println(" ");
			
		}
		
	}

	static void fasz(int... is){
		
		final int ttt = 7878;
		
		System.out.println("fasz");
		System.out.println(is.length);
	}
	
}
