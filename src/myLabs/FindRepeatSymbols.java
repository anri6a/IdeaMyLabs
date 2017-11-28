package src.myLabs;

import java.util.Scanner;

public class FindRepeatSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test String");
        String input=sc.nextLine();
        sc.close();
        int symbArr[]=new int[255];
        for (int i=0;i<input.length();i++){
            ++symbArr[input.charAt(i)];
        }
        for (int i=0;i<255;i++){
            if (symbArr[i]>1){
                System.out.println((char)i+"-repeat "+symbArr[i]+"-times");
            }
        }
    }
   /*private static Scanner workString;

    public FindRepeatSymbols() {
    }

    public static void main(String[] args) {
        workString = new Scanner(System.in);
        System.out.println("Enter String for Work");
        String enterStr = workString.nextLine();
        workString.close();
        int[] symbArr = new int[255];

        int i;
        for(i = 0; i < enterStr.length(); ++i) {
            ++symbArr[enterStr.charAt(i)];
        }

        for(i = 0; i < 255; ++i) {
            if (symbArr[i] > 1) {
                System.out.println((char)i + " - repeat " + symbArr[i] + " times");
            }
        }

    }*/
}
