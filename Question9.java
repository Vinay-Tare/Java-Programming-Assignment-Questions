
/**
* 9. Write an application Program to demonstrate all control statements(selection,iteration and
*transfer). 
*/

import java.util.Scanner;

public class Question9 {
    public static void main(String[] ar) {
        int choice;
        char restart;
        Scanner scn = new Scanner(System.in);
        do{
            System.out.println("\nEnter Your Choice: \n"+
            "1)Selection Statements \n"+
            "2)Iteration Statements \n"+
            "3)Transfer Statements \n");
            choice = scn.nextInt();
            switch(choice){
                case 1:
                SelectionStaments();
                break;
                case 2:
                IterationStatements();
                break;
                case 3:
                TransferStatments();
                break;
                default:
                break;
            }
            System.out.println("\nDo You Want To Choose Another Then Press (Y)?\n"+
            "Else Press Enter Other Key !!");
            restart=scn.next().charAt(0);
        }while(restart=='Y' || restart=='y');
    scn.close();
    }

    private static void SelectionStaments() {
        int n, s;
        Scanner scn = new Scanner(System.in);

        // Selection Statements (if, else if, else)
        System.out.println("\nEnter A Number: (For Testing Selection Statements if, else if, else)");
        n = scn.nextInt();
        if (n < 0)
            System.out.println("Negative Number");
        else if (n == 0)
            System.out.println("Number Is 0");
        else
            System.out.println("Positive Number");

        // The switch Statement
        System.out.println("\nEnter A Number: (For Testing The Switch Statements , switch-case)");
        s = scn.nextInt();
        switch (s) {
            case 1:
                System.out.println("You Entered 1");
                break;
            case 2:
                System.out.println("You Entered 2");
                break;
            case 24:
                System.out.println("You Entered 24");
                break;
            default:
                System.out.println("Default Output(This Means You Haven't Entered"
                        + " Any Of The Available No. To Switch To Using The Switch Case Statement )");
                break;
        }
    }
    private static void IterationStatements()
    {   
        int n=1,d=1;
        int[] i = {1, 2, 3, 4 ,5 }; 
         // Iteration Statements (The while loop, The for loop, The do-while loop, The for-each loop)

         // while Loop 
         System.out.println("\nInitializing The while Loop");
        // while(<loop termination condition>)
         while(n<=5) 
         {
            System.out.println("Using The while Loop "+n+" times");
            n++; // "n" Is Iterator Which Needs To Be Adjusted(increment or decrement) To Reach The 
                 // Termination Condition 
         }
         System.out.println("Outside The Of while Loop\n");

        //  for Loop
        System.out.println("Initializing The for Loop");
        // for(<intialization of iterator>;<loop termination condition>;<increment or decrement>)
        for(int j=1;j<=5;j++) 
        {
            System.out.println("Using The for Loop "+j+" times");
        }
        System.out.println("Outside Of The for Loop\n");

        // do-while Loop
        System.out.println("Initializing The do-while Loop");
        // do { block_of_code } while (<loop termination condition>);
        do {  
            // The do-while loop executes at least one time,
            // then it will check the expression(condition) prior to the next iteration.
            System.out.println("Using The do-while Loop "+d+" times");
         d++;  
        }  
        while (d<=5);  
        System.out.println("Outside Of The do-while Loop\n");

        // for-each Loop
        System.out.println("Initializing The for-each Loop");
        // for(data_type variable : array | collection)
        for (int j: i) {  
            System.out.println("Using The for-each Loop "+j+" times & accessing each element value:"+j+
           "\nat each index starting from index 1 to last index of array|collection");  
           }  
           System.out.println("Outside Of The for-each Loop\n");
           
     }
    private static void TransferStatments()
    {
       // Transfer/Jump Statements
       // (break(labelled/unlabelled), continue(labelled/unlabelled), return statments)

       // break Statements

       // break (unlabelled)
       System.out.println("\nbreak Statement (Unlabelled)");
       System.out.println("Loop Started");
       for (int var = 0;var < 5;var ++) {  
       System.out.println("Var is : " +var);  
       if (var == 3)  
        break; // Stops Execution Of Loop And Exits The Loop 
      }  
      System.out.println("Loop Ended Before var==5 Due To Break Statement At var==3\n");

      // break (labelled) Any String Can Be Used As A Label To Be Assigned To Loops
      System.out.println("break Statement (Labelled)");
      System.out.println("Loop Started");
      Outer: // Outer Is Used As Label For Outer for Loop 
      for (int var1 = 0; var1 < 2; var1++) {  
        Inner: // Inner Is Used As Label For Inner for Loop   
        for (int var2 = 1; var2 < 2; var2++) {  
         System.out.println("var1:" + var1 + ", var2:" + var2);  
         if (var1 == 1)  
          break Outer; // Breaks The Loop(Outer Loop) Having The Label Outer
                       //(We Can Also Break Inner Loop Using "break Inner;"")  
        }  
     }  
     System.out.println("Loop Ended Before var1==5 \n"+
     "Due To Break Statement At var1==1 Using Label Outer\n");

     // continue Statements

     // continue (unlabelled)
     System.out.println("continue Statement (Unlabelled)");
     System.out.println("Loop Started");
     for (int var = 0;var < 5;var ++) {  
       if (var == 3)  {
        System.out.println("Loop Execution Statement Below This Are Skipped At var==3");
        continue;// Skips The Current Iteration( Statement Below This Are Skipped) And Continues The Loop
       }
        System.out.println("Var is : " +var);  
      }  
      System.out.println("Loop Ended\n");

    // continue (labelled) Any String Can Be Used As A Label To Be Assigned To Loops
    System.out.println("continue Statement (Labelled)");
    System.out.println("Loop Started");
    Outer: // Outer Is Used As Label For Outer for Loop 
    for (int var1 = 0; var1 < 2; var1++) { 
        Inner: // Inner Is Used As Label For Inner for Loop   
        for (int var2 = 1; var2 < 2; var2++) {  
         if (var2 == 2) {
          System.out.println("Loop Execution Statement Below This Are Skipped At var1==1 \n"+
          "Due To Continue Statement At var1==1 Using Label Outer");   
          continue Outer;  // Continue The Loop(Outer Loop) Having The Label Outer
                           // (We Can Also Continue Inner Loop Using "continue Inner;"")  
         }
         System.out.println("var1:" + var1 + ", var2:" + var2);  
        }  
       }  
       System.out.println("Loop Ended\n");

    // return Statements
    System.out.println("return Statement (Please Refer Code & Comments)");
    System.out.println("Called Function returnTest");
    System.out.println("It Return Tes Integer Value: "+returnTest()); // It Calls The Function returnTest To Get An Int Value
                                      // In Return , Refer returnTest Function For More
    }
    private static int returnTest(){
        return 5; // Used To Return A Value To The Caller Function,
                  // It Returns The Value In Data Type Define In The Function Return Type 
    }
}