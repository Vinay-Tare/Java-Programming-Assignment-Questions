
/**
 * 5. Write an application that declares two integers, determines whether the first is a multiple of
 *the second and print the result. [ Hint : Use the remainder operator.] 
 */

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 1st No. :");
        n1 = scn.nextInt();
        System.out.println("Enter 2nd No. :");
        n2 = scn.nextInt();
        if (n1 % n2 == 0)
            System.out.println(n1 + " is a multiple of " + n2);
        else
            System.out.println(n1 + " is not a multiple of " + n2);
    }
}
