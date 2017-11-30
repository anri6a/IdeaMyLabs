package myLabs;

import java.util.Scanner;

public class StringArhivator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input test string");
        String inputString=sc.nextLine();
        sc.close();
        StringBuilder result=new StringBuilder();
        char last=inputString.charAt(0);
        int count=1;
        for (int i=1;i<inputString.length();i++){
            if (inputString.charAt(i)==last){
                count++;
            }
            else {
                result.append(last).append(count);
                last=inputString.charAt(i);
                count=1;
            }
        }
        System.out.println("result string - "+result+last+count);
    }
}
