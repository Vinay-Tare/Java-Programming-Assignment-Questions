/** 20. WAP in java to implement Selection Sort Algo. */

import java.util.Scanner;

public class Question20 {
    public static void main(String[] ar){
        int size;
        int[] arr;
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Size Of The Array You Will Define :");
        size = scn.nextInt();
        arr= new int[size];
        System.out.print("Enter Array Elements One By One (Integer Array):");
        for(int i=0;i<size;i++)
             arr[i]=scn.nextInt();

        selectionSort(arr);
        System.out.print("\nSorted Array Is (In Ascending Order): ");
        for(int a : arr)
            System.out.print(a+", ");
    }

    // Function Implementing Selection Sort Algorithm
    static int selectionSort(int[] arr){
        int temp, arrsize=arr.length;

        for(int i=0;i<arrsize;i++){
            int minpos=i;

            for(int j=i+1;j<arrsize;j++)
                if(arr[j]<arr[minpos])
                    minpos=j;

            temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
       }

        return arr[0];
    }
}
