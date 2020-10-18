/**
* 4. Write an application that declares 5 integers, calculates and print the average of these
*numbers. 
*/

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int a,b,c,d,e,smallest;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 5 Integers:"); 
        a=scn.nextInt();
        b=scn.nextInt();
        c=scn.nextInt();
        d=scn.nextInt();
        e=scn.nextInt();
        
        smallest = a;
        if (b < smallest)
            smallest = b;
        if (c < smallest)
            smallest= c;
        if (d < smallest)
            smallest= d;
        if (e < smallest)
            smallest= e;

        System.out.println("Smallest of five integers is: "+smallest);
    }
}