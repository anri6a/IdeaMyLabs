package myLabs;

import java.util.Scanner;

/**
 * Created by 12 on 01.11.2017.
 * Print input number in buh format
 */
public class NumbBuhFormat {
    public static void main (String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("ВВедите число!");
        int input = sc.nextInt();
        System.out.printf("%,d\n", input);
    }
}
