/** 13. Write an application for demonstrating with for-each loop */

public class Question13 {
    public static void main(String[] ar) {
        int[] INTEGERS = {10,9,8,7,6,5,4,3,2,1};
        String[] STRINGS ={"Ten","Nine","Eight","Seven","Six","Five","Four","Three","Two","One"}; 

        System.out.println("\nPrinting INTEGERS Array Elements Using for-each Loop: ");  
        for(int integer : INTEGERS)
            System.out.print(integer+" ");

        System.out.println("\n\nPrinting STRINGS Array Elements Using for-each Loop: "); 
        for(String string : STRINGS)
            System.out.print(string+" ");
    }
}
