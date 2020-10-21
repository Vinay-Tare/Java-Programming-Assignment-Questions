/**
 * 31. Write an application that uses String method indexOf to determine the
 * total number of occurrences of any given alphabet in a defined text.
 */

import java.util.Scanner;

public class Question31 {
    public static void main(String[] ar){
        String myString;
        char alphabet; 
        int totalOccurences=0,fromIndex=0;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter A String : ");
        myString = scn.nextLine();
        
        System.out.println("\nEnter An Alphabet For Which You Want To Determine The Total No. Of Occurences In The Given Text/String: ");
        alphabet = scn.next().charAt(0);

        // Checks If The Alphabet Is Present In The String Starting From 'fromIndex' Til The End
        // If Not Found It Returns A '-1'
        while(myString.indexOf(alphabet,fromIndex)>=0){
            // 'fromIndex' Stores The Index From Where We Would Search For The Alphabet
            // It Is Assigned The Value Of (Index At Which It Found The Alphabet + 1) 
            // Every Time It Finds The Alphabet At Any Particular Index
            // So That Next Time We Can Start Searching For The Alphabet From The Next Index 
            fromIndex = myString.indexOf(alphabet,fromIndex)+1;
            totalOccurences++;
        }
        System.out.println("\nTotal Occurences Of '"+alphabet+"' In Given Text/String Is : "+totalOccurences);
    }
}
