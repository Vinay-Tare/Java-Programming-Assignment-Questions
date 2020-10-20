/** 22. WAP in java to implement Binary Search Algorithm  */

import java.util.Scanner;

public class Question22 {
    public static void main(String[] ar){
        int size,k,index;
        int[] arr;
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Size Of The Array You Will Define :");
        size = scn.nextInt();
        arr= new int[size];
        System.out.print("Enter Soted Array Elements One By One (Sorted Integer Array):");
        for(int i=0;i<size;i++)
             arr[i]=scn.nextInt();

        System.out.print("\nEnter The Number You Want To Seacrh For In The Array: ");
        k=scn.nextInt();
        index = binarySearch(arr, k);
        if(index>=0)
            System.out.print(k+" Is Found In The Array At Index No. : "+(index+1));
        else
            System.out.print(k+" Is Not Found In The Array");
    }    

    // Function Implementing Binary Search Algorithm
    static int binarySearch(int[] arr,int k){
        int low,mid,high,size;
        size = arr.length;
        low = 0;
        high = size-1;
        
        while(low<=high)
        {
            mid = (low+high)/2;
            if(arr[mid]==k)
                return mid;
            if(arr[mid]<k)
                low = mid + 1;
            if(arr[mid]>k)
                high = mid - 1;
        }
        return -1;
    }
}
