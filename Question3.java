/**
 * 3. Write an application that declares 5 integers, determines and prints the
 * largest and smallest in the group.
 */

import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        int a,b,c,d,e,largest;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 5 Integers:"); 
        a=scn.nextInt();
        b=scn.nextInt();
        c=scn.nextInt();
        d=scn.nextInt();
        e=scn.nextInt();
        
        largest = a;
        if (b > largest)
            largest = b;
        if (c > largest)
            largest = c;
        if (d > largest)
            largest = d;
        if (e > largest)
            largest = e;

        System.out.println("Largest of five integers is: "+largest);
    }
}
