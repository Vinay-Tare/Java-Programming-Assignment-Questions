/** 27. WAP in java to demonstrate VARARGS. */

/**          Variable Argument (Varargs): 
 * It is short-form for variable-length arguments. 
 * The varrags allows the method to accept zero or muliple arguments. 
 * Before varargs either we use overloaded method or take an array as the method parameter,
 * but it was not considered good because it leads to the maintenance problem.
 * If we don't know how many argument we will have to pass in the method, varargs is the better approach.
 * 
 * # A method that takes a variable number of arguments is a varargs method.
*/

/**
 * Source: Here Is Are Some Good References For More Brief Explaination And
 * Rules For Implementing VARARGS:
 * https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/
 * https://www.javatpoint.com/varargs
 */

 /**
     * Syntax Of Varargs: The varargs uses ellipsis i.e. three dots(periods) after
     * the data type. Syntax is as follows:
     * 
     *  return_type method_name(data_type... variableName){}
     * 
     * # Rules for varargs: 
     * 
     * While using the varargs, you must follow some rules
     * otherwise program code won't compile. The rules are as follows:
     * 
     * There can be only one variable argument in the method. Variable argument
     * (varargs) must be the last argument.
     */

public class Question27 {
    public static void main(String[] ar) {
        System.out.println("Implementing/Using 'int addInts(int ... Ints)' Method To Add Integers Using VARARGS");
        System.out.println("Input Integers : 2,3 & Addition Of These Integers Is: "+addInts(1, 2));
        System.out.println("Input Integers : 1,2,4,5,7 & Addition Of These Integers Is: "+addInts(1, 2, 4, 5, 7));
    }

    // Definining Method Taking VARARGS As Argument
    static int addInts(int... Ints) {
        int addition = 0;
        for (int Int : Ints)
            addition = addition + Int;
        return addition;
        
    }
}
