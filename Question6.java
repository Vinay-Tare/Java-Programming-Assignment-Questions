/** 6. Write an application that calculates the product of the odd integers from 1 to 15 */

public class Question6 {
    public static void main(String[] args) {
        int product=1;
        for(int i=1;i<=15;i=i+2)
            product=product*i;
  
    System.out.println("Product Of Odd Integers Form 1 To 15 Is: "+product);
    }
}