/** 16. Write an application Program of factorial number. */

import java.util.Scanner;

public class Question16 {
    public static void main(String[] ar){
        int number, factorial;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter A Number You Want Factorial Of: ");
        number =scn.nextInt();
        if(number==0){
            factorial=1;
        }
        else{
            factorial = number;
            for(int i=number-1; i>0;i--){
                factorial = factorial*i;
            }
        }
        System.out.println("Factorial Of "+number+" Is: " +factorial);

        /**
         * For Finding Factorial Using Recursion Of Fucntion
         * Uncomment The "int factorialOf(int n)" Fucntion
         * We Have To Use Function "int factorialOf(int n)" As Follows :
         * 
         * System.out.println("Factorial Of "+i+" Is "+ factorialOf(i));
         */
    }
    
    // private static int factorialOf(int n)
    // {
    //     int fact=0;
    //     if(n==0)
    //         return 1;
    //     fact=n*factorialOf(n-1);
    //     return fact;
    // }
}
