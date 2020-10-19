
/** 10.Write an application Program to demonstrate Method call activation records */

/** Sources : 
 * Here Is An Reference Source You Can Go With On This Topic (A Much Better Ecplaination):
 * http://people.cs.ksu.edu/~schmidt/300s05/Lectures/Lecture3.html
 */

import java.util.Scanner;

public class Question10 {
    public static void main(String[] ar) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter A No. To Get Multiple Of :");
        Multiple multiple = new Multiple(scn.nextInt());
        System.out.println(
                "\n Enter The M'th Multiple You Want For This No.\n" + " (For Ex: 3rd Multiple Of 4 is 12) : ");
        System.out.println("\n The Answer Is: " + multiple.getMultiple(scn.nextInt()));
    }
}

class Multiple {
    private int n;

    public Multiple(int n) {
        this.n = n;
    }

    // Returns m'th multiple of the no. 'n'
    public int getMultiple(int m) {
        int result;
        result = this.n * m;
        return result;
    }
}

/**                 Method Call Activation Record
 *   # Almost every programming language that contains procedures or methods in its
 *   vocabulary is implemented with a stack structure, and this is also the case
 *   with Java. 
 *   # The earlier lecture on execution semantics showed how objects are
 *   constructed within a process's storage partition. But the presentation in
 *   that lecture simplified the semantics of method call --- the lecture showed
 *   the code of an invoked method ``copied'' into the object that was the target
 *   of the invocation. In reality, no code is copied into objects; instead, an
 *   activation record is constructed and pushed onto the process's activation
 *   record stack.
 */

