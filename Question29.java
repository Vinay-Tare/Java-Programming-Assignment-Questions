/** 29. WAP in java to demonstrate Enumarated data type */

/** Sources:
 * 
 * Here Is Are Some Good References For More Brief Explaination Of Enum DataType:
 * https://www.geeksforgeeks.org/enum-in-java/
 *                      
 * Also Read About 'java.lang.Enum' Class In Java ( It Is The Common 
 * Base Class Of All Java Language Enumeration Types)  & Its Methods : 
 * https://www.geeksforgeeks.org/java-lang-enum-class-java/
 */

public class Question29 {

    // Decalring An Enum Data Type For Storing Apporximate Values Of Some Scientific Constants
    enum Scientific_Consts{ 
        PI(3.1415) ,EULERS_NUMBER(2.7182);
        private final double VALUE;
        // Constructor For Initializing/Storing Double Values In The Members Of The Enum DataType 
        Scientific_Consts(double value)
        {
            this.VALUE = value;
        }
     }
    public static void main(String[] ar) {
        //Printing Values Values Of The Scientific Constant Defined Inside The Enum DataType
       System.out.println("Value Of Scientific Constant PI Is : "+Scientific_Consts.PI.VALUE);
       System.out.println("Value Of Scientific Constant EULERS_NUMBER Is : "+Scientific_Consts.EULERS_NUMBER.VALUE);
    }  
}
