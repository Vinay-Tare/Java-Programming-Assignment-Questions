/**
* 4. Write an application that declares 5 integers, calculates and print the average of these
*numbers. 
*/

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int a,b,c,d,e;
        double average;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 5 Integers:"); 
        a=scn.nextInt();
        b=scn.nextInt();
        c=scn.nextInt();
        d=scn.nextInt();
        e=scn.nextInt();
        average = (double)(a+b+c+d+e)/5;

        System.out.println("Average of five integers is: "+average);
    }
}