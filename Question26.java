/** 26. WAP in java to demonstrate 3D Array. */

public class Question26 {

    public static void main(String[] ar){

        // Declaration Of A 3-D Array (Integer Array) Of Dimension 2 by 3 by 4
        int[][][] arr =  new int[2][3][4];
        
        // Initializing The 3-D Array Elements (All By Zero) 
        System.out.println("\nInitializing All The 3-D Array Elements By Zero (Array Dimension Is (2 by 3 by 4)).\n.\n.\n.");
        for(int i=0;i<2;i++)
                for(int j=0;j<3;j++)
                    for(int k=0;k<4;k++)
                        arr[i][j][k] = 0; 
                        System.out.println("All The 3-D Array Elements Are Initialized By Zero ");
                        
        // Showing The 3-D Array Elements (As 2 Arrays Of 2-D Array Type Of Dimension (3 by 4))
        System.out.println("\nShowing The 3-D Array Elements (As 2 Arrays Of 2-D Array Type Of Dimension (3 by 4))\n");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<4;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
