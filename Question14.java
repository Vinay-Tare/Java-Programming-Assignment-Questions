/** 14. Write an application for demonstrate all shift operators */

/** Sources : 
 * Here Are Some Reference Sources You Can Go With On This Topic (A Much Better Explaination):
 * 
 * https://www.iitk.ac.in/esc101/05Aug/tutorial/java/nutsandbolts/bitwise.html#:~:text=A%20shift%20operator%20performs%20bit,in%20the%20Java%20programming%20language.&text=Each%20operator%20shifts%20the%20bits,indicated%20by%20the%20second%20operand.
 * https://www.javatpoint.com/operator-shifting
 */

/**             Bitwise Shift Operators
* Operator	 Use	         Description
*   <<	     op1 << op2	    Shift bits of op1 left by distance op2; fills with zero bits on the right-hand side
*   >>	     op1 >> op2	    Shift bits of op1 right by distance op2; fills with highest (sign) bit on the left-hand side
*   >>>	     op1 >>> op2    Shift bits of op1 right by distance op2; fills with zero bits on the left-hand side
*/

public class Question14 {
    public static void main(String[] ar) {
        byte x, y;  
        x=10;  
        y=-10;  
        System.out.println("Bitwise Left Shift: x<<2 = "+(x<<2));  
        System.out.println("Bitwise Right Shift: x>>2 = "+(x>>2));  
        System.out.println("Bitwise Zero Fill Right Shift: x>>>2 = "+(x>>>2));  
        System.out.println("Bitwise Zero Fill Right Shift: y>>>2 = "+(y>>>2));  
    }    
}
