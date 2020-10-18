/** 7. Write an application that evaluates the factorial of the integers from 1 to 5.*/

public class Question7 {
    public static void main(String[] args) {
        System.out.println("The Factorial Of The Integers From 1 To 5 Are :");
        for(int i=1;i<=5;i++)
            System.out.println("Factorial Of "+i+" Is "+ factorialOf(i));
    }
    private static int factorialOf(int n)
    {
        int fact=0;
        if(n==0)
            return 1;
        fact=n*factorialOf(n-1);
        return fact;
    }
}
