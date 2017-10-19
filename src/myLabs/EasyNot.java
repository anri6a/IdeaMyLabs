package myLabs;

import java.util.Scanner;

/**
 * Created by 12 on 19.10.2017.
 */
public class EasyNot {
    public static void main(String[] args) {
//        int x = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        int input = sc.nextInt();
        sc.close();
        System.out.println("Число " + input);
        boolean a = false;
        for (int i = 2; i < input; i++) {
            if (input % i == 0)
                a = true;
            break;
        }
        if (a) {
            System.out.println("Не простое");
        } else
            System.out.println("Простое");
    }
}

