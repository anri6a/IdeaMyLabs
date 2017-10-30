package myLabs;

import java.util.Scanner;

/**
 * Created by 12 on 30.10.2017.
 * console calculator for addition and subtraction and 'q' like exit
 */
public class EasyCalc {
    public static void main(String args[]) {
        String in;
        int res = 0;
        for (int i = 0; ; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("введите первое число");
            int a = sc.nextInt();
            System.out.println("введите второе число");
            int b = sc.nextInt();
            System.out.println("1 - сложить");
            System.out.println("2 - вычесть");
            System.out.println("q - выйти");
            in = sc.next();
            sc.close();
            if (in.equals("q"))
                break;
            else {

                switch (in) {
                    case "1":
                        res = a + b;
                        break;
                    case "2":
                        res = a - b;
                        break;
                    default:
                        System.out.println("неверный выбор");
                }
                System.out.println("результат - " + res);
            }

        }
    }
}
