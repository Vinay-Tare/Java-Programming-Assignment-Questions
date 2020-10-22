/**
 * 3. Write an application that declares 5 integers, determines and prints the
 * largest and smallest in the group.
 */

import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        int a,b,c,d,e,largest,smallest;
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
