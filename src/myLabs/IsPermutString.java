package src.myLabs;

import java.util.Arrays;
import java.util.Scanner;

public class IsPermutString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String firstInputStr = sc.nextLine();
        System.out.println("Enter second String");
        String secondInputStr = sc.nextLine();
        sc.close();
        char[] firstStrChar = firstInputStr.toCharArray();
        Arrays.sort(firstStrChar);
        firstInputStr = String.valueOf(firstStrChar);
        char[] secondStrChar = secondInputStr.toCharArray();
        Arrays.sort(secondStrChar);
        secondInputStr = String.valueOf(secondStrChar);
        if (firstInputStr.equals(secondInputStr)) {
            System.out.println("вторая строка является перестановкой первой");
        } else System.out.println("вторая строка не связана с первой");
    }
}
