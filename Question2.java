/**State the order of evaluation of the operations in each of the following Java statements and
 *implement them to show the value of x after each statement.
 *(1) x1 = 7 + 3 * 6 / 2 – 1;                   
 *(2) x2 = 2 % 2 + 2 * 2 – 2 / 2;               
 *(3) x3 = ( 3 * 9 * ( 3 + ( 9 * 3 / (3)) ) );
*/

/**                             **** THEORY ****
 * Operators	                            Precedence	            Associativity
*postfix increment and decrement         	++ --	                left to right
*prefix increment and decrement, and unary	++ -- + - ~ !	        right to left
*multiplicative                          	* / %	                left to right
*additive	                                + -	                    left to right
*shift	                                    << >> >>>	            left to right
*relational                                  < > <= >= instanceof	left to right
*equality	                                == !=	                left to right
*bitwise AND                                 &	                    left to right
*bitwise exclusive OR                        ^	                    left to right
*bitwise inclusive OR                        |	                    left to right
*logical AND                                 &&	                    left to right
*logical OR                                  ||	                    left to right
*ternary	                                    ? :	                right to left
*assignment	                                = += -= *= /= %=                
*                                           &= ^= |= <<= >>= >>>=	left to right
*/ 

public class Question2 {
    public static void main(String[] ar) {
    int x1,x2,x3;
    x1 = 7 + 3 * 6 / 2 - 1;
    x2 = 2 % 2 + 2 * 2 - 2 / 2;
    x3 = (3 * 9 * (3 + (9 * 3 / (3))));
    System.out.println("x1="+x1);
    System.out.println("x2="+x2);
    System.out.println("x3="+x3);                
    }
    
}
