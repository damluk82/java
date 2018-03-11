package chapter4_Encapsulation;

public class Miezte2 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("ttt11ggg");
		processData(sb);
		
	
	}

	static public void processData(StringBuilder sb) {
		
		Character currentChar;
		int index = 0; 
		
		for(int i=0; i<sb.length();i++){
			
			if(i<index)
				continue;
			
			currentChar = sb.charAt(i);
			
			while(currentChar.equals(sb.charAt(index))){				
				sb.deleteCharAt(index);
				System.out.println(sb);
				index += 1;
				System.out.println(index);
				if (index >= sb.length()){
					break;
				}
					
			}
			
			
		}
		System.out.println(sb);
		
	}
}
