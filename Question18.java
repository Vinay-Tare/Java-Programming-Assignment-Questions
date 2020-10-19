/** 18. Write an application Program of armstrong number. */

import java.util.Scanner;

public class Question18 {
    public static void main(String[] ar){
        int n,temp,a=0,digit;
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter An Number To Check If It Is An Armstrong No. : ");
        n = scn.nextInt();
        temp=n;

        while(temp>0){
            digit = temp % 10;
            a=a+(digit*digit*digit);
            temp = temp/10;
        }

        if(n==a)
            System.out.println(n+" Is An Armstrong No. !!");
        else
            System.out.println(n+" Is Not An Armstrong No. !!");
    }
}
