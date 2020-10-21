/**
 * 30. Write an application that uses String method equals and equalsIgnoreCase
 * to tests any two string objects for equality.
 */

import java.util.Scanner;

public class Question30 {
    public static void main(String[] ar){
        String s1,s2;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter First String :");
        s1 = scn.nextLine();
        System.out.println("Enter Second String :");
        s2 = scn.nextLine();

        System.out.println("\nChecking Equivalence Of String Using 'equals()' Method Of String Class \n"
        +"(It Checks The Equivalence Of Strings Case Sensitively ) .....");
        if(s1.equals(s2))
            System.out.println("String 1: "+s1+" And String 2: "+s2+" Are Equal !!");   
        else
            System.out.println("String 1: "+s1+" And String 2: "+s2+" Are Not Equal !!");

        System.out.println("\nChecking Equivalence Of String Using 'equalsIgnoreCase()' Method Of \n"+
        "String Class (It Checks The Equivalence Of Strings Case Insensitively (IgnoresCase)) .....");
        if(s1.equalsIgnoreCase(s2))
            System.out.println("String 1: "+s1+" And String 2: "+s2+" Are Equal !!");   
        else
            System.out.println("String 1: "+s1+" And String 2: "+s2+" Are Not Equal !!");
    }
}
