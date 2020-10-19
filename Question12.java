/**
 * 12. Write an application for calculating Compound-interest (interest rate of 5% for 10 years) with
 *for loop. 
 */

import java.util.Scanner;

public class Question12 {
    public static void main(String[] ar) {
        double amount = 0, rate = 5, time =10, expRate = 1, principle = 0, ci = 0;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Principle Amount:");
        principle = scn.nextDouble();
        System.out.println("Rate: 5% & Time Duraton: 10 Years Accourding To Question !!");

        /**
         * C.I. = A - P = P *(1+R/100)^T - P
         */

        for(int i=1;i<=time;i++)
         expRate=expRate*(1+rate/100); // Evaluating (1+R/100^T)
        
        amount = principle * expRate; // A = P * (1+R/100^T)
        ci = amount - principle; //  C.I. = A - P
        System.out.println("Compund Interest Is: "+ci);
    }
}
