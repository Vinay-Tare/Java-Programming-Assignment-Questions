/** 21. WAP in java to implement Bubble Sort Algo. */

import java.util.Scanner;

public class Question21 {
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

        bubbleSort(arr);
        System.out.print("\nSorted Array Is (In Ascending Order): ");
        for(int a : arr)
            System.out.print(a+", ");
    }

    // Function Implementing Bubble Sort Algorithm
    static void bubbleSort(int[] arr){
        int temp,size=arr.length;

        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
