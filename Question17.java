/** 17. Write an application Program of fibonacci series. */


import java.util.Scanner;

public class Question17 {
    public static void main(String[] ar){
        int count;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The No. Of Terms Upto Which You Want The Fibonacci Series : ");
        count = scn.nextInt();

        for(int i=0;i<count;i++)
            System.out.println(getFibonacci(i));
       scn.close();
    }

    // Return Fibonacci Series Element At Given Index Using Recursion
    static int getFibonacci(int n){
        if(n<=1)
            return n;
        return getFibonacci(n-1)+getFibonacci(n-2);
    }
}
