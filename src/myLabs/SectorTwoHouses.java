package myLabs;

import java.util.Scanner;

/**
 * Created by 12 on 30.10.2017.
 * Check can we build 2 houses with input sizes on sector with input sizes
 */
public class SectorTwoHouses {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Участок - ");
        int e = sc.nextInt();
        System.out.println("на - ");
        int f = sc.nextInt();
        System.out.println("Дом 1 - ");
        int a = sc.nextInt();
        System.out.println("на - ");
        int b = sc.nextInt();
        System.out.println("Дом 2 - ");
        int c = sc.nextInt();
        System.out.println("на - ");
        int d = sc.nextInt();
        sc.close();
        if ((e >= a && e >= c && f >= (b + d)) ||
                (e >= a && e >= d && f >= (b + c)) ||
                (e >= b && e >= c && f >= (a + d)) ||
                (e >= b && e >= d && f >= (a + c)) ||
                (f >= a && f >= c && e >= (b + d)) ||
                (f >= a && f >= d && e >= (b + c)) ||
                (f >= b && f >= c && e >= (a + d)) ||
                (f >= b && f >= d && e >= (a + c)))
            System.out.println("Вместятся");
        else
            System.out.println("Не вместятся");
    }
}
