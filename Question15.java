/** 
 * 15. Modify the above compound-interest application to repeat its steps for interest rates of 5%, 6%, 7%,
 *     8%, 9% and 10%. Use a for loop to vary the interest rate. 
 */

import java.util.Scanner;

public class Question15 {
    public static void main(String[] ar) {
        double amount = 0, rate = 0, time = 10, expRate = 1, principle = 0, ci = 0;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Principle Amount:");
        principle = scn.nextDouble();
        System.out.println("Time Duraton: 10 Years Accourding To Question !!");

        /**
         * C.I. = A - P = P *(1+R/100)^T - P
         */
        for (rate = 5; rate <= 10; rate++) // For Varying Interest Rate
        {
            expRate = 1;
            for (int i = 1; i <= time; i++)
                expRate = expRate * (1 + rate / 100); // Evaluating (1+R/100^T)

            amount = principle * expRate; // A = P * (1+R/100^T)
            ci = amount - principle; // C.I. = A - P
            System.out.println("Compund Interest For Rate: " + rate + "% Is: " + ci);
        }
    }
}
