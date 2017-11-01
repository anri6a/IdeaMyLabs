package myLabs;

import java.util.Scanner;

/**
 * Created by 12 on 30.10.2017.
 * Count summary of numbers
 */
public class SumOfNumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("введите число");
        int input=sc.nextInt();
        sc.close();
        int temp;
        int sum=0;
        while (input!=0){
            temp=input%10;
            sum+=temp;
            input/=10;
        }
        System.out.println("Сумма цифр = "+sum);
    }
}
