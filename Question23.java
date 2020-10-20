/** 23. WAP in java to demonstrate Stack class. */

/**                     Stack Class In Java
 * A stack is a data structure which follows LIFO (Last In First Out). Java
 * Stack Class falls under the basic Collection Hierarchy Framework in which you
 * can perform the basic operations such as push, pop, etc. We know that Java
 * collection framework includes interfaces and classes. Now, let’s have a clear
 * view of how stack class in Java is arranged in the Java collections framework
 * hierarchy.
 * 
 * We Need To Import Stack Class By Using "import java.util.Stack"  
 * 
 * Methods Of Stack Class In Java
 * empty(),isEmpty() Checks if the stack is empty
 * push() Puts an item to the top of the stack
 * pop() Remove the object from the stack
 * peek() Looks at the object of a stack without removing it
 * search() Searches item in the stack to get its index
 * size()  Returns the size of the Stack or the number of elements present in the Stack.
 * 
 * Source :
 * Here Is An Brief Explaination & And Usage Exmaple Of Stack Class & Its Methods:
 * https://www.geeksforgeeks.org/stack-class-in-java/
 */

import java.util.Random;
import java.util.Stack;

public class Question23 {
    public static void main(String[] ar) {
        int position;
        // Creating Object Of Stack Class
        Stack stack = new Stack();

        // push Method
        for(int i=1;i<=3;i++)
            System.out.println(stack.push(i)+" Pushed Into Stack ");

        //size Method
        System.out.println("\nSize Of The Stack Is: "+stack.size());
        
        //peek Method
        System.out.println("\nElement At Top Of Stack Is : "+stack.peek());

        //search Method
        System.out.println("\nSearching For Element Value 2 In The Stack ...");
        position = stack.search(2);
        if(position == -1)
            System.out.println("Element Not Found");
        else
            System.out.println("Element Found At Position: "+position );

        //empty Method
        if(stack.empty())
            System.out.println("\nStack Is Empty !!\n");
        else
            System.out.println("\nStack Is Not Empty !!\n");
        
        //pop Method
        for(int i=0;i<5;i++){
            System.out.println("Trying Popping An Element From Top Of The Stack ...");
            // Another Implementation Of Empty Method "isEmpty()"
            if(stack.isEmpty()){
                System.out.println("\nCannot Pop An Element, Stack Is Already Empty !!");
                System.out.println("Size Of The Stack Is: "+stack.size());
                break;
            }
            System.out.println("Popped Element Is:"+ stack.pop());  
        }
    }
}
