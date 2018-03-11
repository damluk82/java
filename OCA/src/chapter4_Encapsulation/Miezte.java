package chapter4_Encapsulation;

public class Miezte {

	String a;
	

	    static String temp = "";
	    static public void stringClean(String str) 
	    {
	        int length = str.length();
	        for(int i = 0; i<length; i++)
	        {
	            if(str.charAt(i) != ' ')
	            {
	                char curr_letter = str.charAt(i);
	                temp += curr_letter;
	                str = str.replace(str.charAt(i), ' ');
	             
	            }
	        }
	    }
	    public static void main(String[] args) 
	    {
	        stringClean("yyzzzay");
	        System.out.println(temp);

	    }
	}
	
