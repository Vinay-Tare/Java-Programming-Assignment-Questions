/** 24. WAP in java to demonstrate Anonymous Array */

/**
 * Anonymous Array : It is an array- without any name is anonymous array.
 * It is an array just for creating and using instantly.
 */
public class Question24 {
    public static void main(String[] ar) {
        // Anonymous array is passed as an argument of method
        System.out.println(findAverage(new int[] { 20, 25, 90, 75, 55 }));

    }

    static double findAverage(int[] arr) {
        int sum, noOfElements;
        sum = 0;
        double average;
        noOfElements = arr.length;
        for (int i = 0; i < noOfElements; i++)
            sum = sum + arr[i];
        average = (double) sum / noOfElements;
        return average;
    }
}
