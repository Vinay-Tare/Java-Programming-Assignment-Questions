/** 32. Write an application that uses String method concat to concatenate two defined strings. */

import java.util.Scanner;

public class Question32 {
    public static void main(String[] ar){
        String s1,s2,s3;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First String :");
        s1 = scn.nextLine();
        System.out.println("Enter Second String :");
        s2 = scn.nextLine();

        s3 = s1.concat(s2);
        System.out.println("The Concatenated String Is (Using 'concat()' Method Of String Class) : "+s3);
    }
}
