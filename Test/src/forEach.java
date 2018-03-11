public class forEach {

    public static void main(String[] args) {
        int myArr [][] = new int[3][3];
        myArr[0][0] = 11;
        myArr[0][1] = 2;
        myArr[0][2] = 4;
        myArr[1][0] = 4;
        myArr[1][1] = 5;
        myArr[1][2] = 6;
        myArr[2][0] = 10;
        myArr[2][1] = 8;
        myArr[2][2] = -12;
            
        int first=0;
        int second=0;
               
        for (int i=0; i<myArr.length; i++){
            
            for (int j=0; j<myArr[i].length ;j++){
               
                //if (i == 0 && j == 0 || i == 1 && j == 1 || i == 2 && j == 2 ){
                //    first += myArr[i][j];
                //} else if (i == 0 && j == 3 || i == 1 && j == 1 || i == 2 && j == 0 ){
                //    second += myArr[i][j];
                //}
                
                if (i == 0) {
                    if (j == 0) {
                        first += myArr[i][j];
                    } else if (j == 3) {
                        second += myArr[i][j];
                    }
                }
                
                if (i == 2) {
                    if (j == 0) {
                        first += myArr[i][j];
                    } else if (j == 2) {
                        second += myArr[i][j];
                    }
                }   
                
                if (i == 1 && j == 1) {
                    second += myArr[i][j];
                }

            }  
             
        }
        System.out.println(first + " " + second);
    }
}