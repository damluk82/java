import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Go
{


    public static void main (String[] args) throws java.lang.Exception
    {
        String input = "interview";
        System.out.println(input);

        int[] list = new int[input.length()];

      for (int i=0; i<input.length(); i++){

       list[i] = i;

      }
   //   Collections.shuffle(list);

      for (int j=0; j<list.length; j++){
    	  //System.out.println(input.charAt(j));
    	  System.out.println(j);

      }

      
      

      
      
      //System.out.println(list[0]);    

    }


}

