/** 28. WAP in java to demonstrate Scanner class. */

/** #Sources:
 * Here Is Are Some Good References For More Brief Explaination Of The Scanner Class
 * & Its Methods For Taking Various Types Of Inputs From The Input Stream/Source :
 * https://www.javatpoint.com/Scanner-class
 */

// To Use It In Our Program We Need To Import It First From The  "java.util" Package
import java.util.Scanner; 

public class Question28 {
    public static void main(String[] ar){
        int a,b;

        // We Need To Take The Scanner Class Reference By Creating An Object Of It
        // Its Constructor Takes The Input Stream/Source We Want To Take Input From
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a :");
        a = scn.nextInt(); // Scanner Class Has Various Methods For Taking Inputs 
        System.out.println("Enter b :");
        b = scn.nextInt(); 
        // 'nextInt()'' Method Is Used For Taking An Integer As An Input From Input Stream 
        // It scans the next token of the input as an Int.
        // (It Will Throw Exception If It Isn't An Integer Value)
        System.out.println("Sum Of a & b Is: "+(a+b));         
    }
}
