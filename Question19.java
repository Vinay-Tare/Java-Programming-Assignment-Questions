/** 19. WAP to determine whether an entered number is prime or not. */

import java.util.Scanner;

public class Question19 {
    public static void main(String[] ar){
        int n;
        boolean isPrime;
        Scanner scn = new Scanner(System.in) ;
        System.out.print("Enter A No. To Check Whether It Is Prime Or Not : ");
        n = scn.nextInt();
        isPrime = checkPrime(n);
        if(isPrime)
            System.out.println(n+" Is A Prime Number!");
        else
            System.out.println(n+" Is Not A Prime Number ! ");                
   }
   
   static boolean checkPrime(int n){
        if(n<=1)
            return false;
        for(int i=2;i<n/2;i++)
            if(n%i==0)
                return false;
        return true;
   } 
}
