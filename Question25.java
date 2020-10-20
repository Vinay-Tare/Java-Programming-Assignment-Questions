/** 
 * 25. Write a Java program that randomly fill a 3 by 4 by 6 array and then prints the largest and
 * smallest values in the array.
 */

import java.util.Random; // Used For Generation Of Random Values

public class Question25 {
    public static void main(String[] ar){
        int smallest,largest;
        int [][][] arr =  new int[3][4][6];

        Random random = new Random();

        System.out.println("Genreating A 3 by 4 by 6 Array And Filling It With Random Values....\n.\n.\n.");
        for(int i=0;i<3;i++)
            for(int j=0;j<4;j++)
                for(int k=0;k<6;k++){
                    arr[i][j][k] = random.nextInt(101);
                    //  Can Also Use arr[i][j][k] = (int) (Math.random()*100); 
                    // Fills Array By Generating Random Values 
                }
        
        System.out.println("\nShowing A 3 by 4 by 6 Array Filled With Random Values....\n");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<6;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
        smallest = arr[0][0][0];
        largest = arr[0][0][0];
        for(int i=0;i<3;i++)
            for(int j=0;j<4;j++)
                for(int k=0;k<6;k++){
                    if(arr[i][j][k]<smallest)
                        smallest = arr[i][j][k];
                    if(arr[i][j][k]>largest)
                        largest = arr[i][j][k];
                }
                    
        System.out.println("\nSmallest Element In The Array Is : "+smallest);
        System.out.println("\nLargest Element In The Array Is : "+largest);
    }
}
