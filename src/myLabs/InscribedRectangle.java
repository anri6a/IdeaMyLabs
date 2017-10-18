package myLabs;

import java.util.Scanner;

/**
 * Created by 12 on 18.10.2017.
 */
public class InscribedRectangle {
    public static void main (String [] args){
        Scanner diag_a=new Scanner(System.in);
        System.out.println("Введите первую диагональ");
        String a=diag_a.nextLine();
        int diagA=Integer.parseInt(a);
        System.out.println("Введите вторую диагональ");
        String b=diag_a.nextLine();
        int diagB=Integer.parseInt(b);
        System.out.println("Введите радиус");
        String r=diag_a.nextLine();
        int radius=Integer.parseInt(r);

        if (Math.sqrt(diagA*diagA+diagB*diagB)<2*radius)
            System.out.println("Закроет");
        else
            System.out.println("не Закроет");
    }
}
