package myLabs;

import java.util.Scanner;

/**
 * Created by 12 on 27.10.2017.
 * Print next day after input day
 */
public class NextDayMonthYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день");
        int dB = sc.nextInt();
        System.out.println("Введите месяц");
        int mB = sc.nextInt();
        System.out.println("Введите год");
        int yB = sc.nextInt();
        sc.close();
        int countDays = 0;
        int max = 0;
        switch (mB) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                countDays = 31;
                max = countDays;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                countDays = 30;
                max = countDays;
                break;
            case 2:
                if (((yB % 4 == 0) && !(yB % 100 == 0)) || (yB % 400 == 0)) {
                    countDays = 29;
                    max = countDays;
                } else {
                    countDays = 28;
                    max = countDays;
                }
                break;
            default:
                System.out.println("Такого месяца не существует");
                break;
        }

        if (!(dB == max) && !(mB == 12)) {
            dB += 1;
        }
        if ((dB == max) && !(mB == 12)) {
            mB += 1;
            dB = 1;
        }
        if ((dB == max) && (mB == 12)) {
            yB += 1;
            dB = 1;
            mB = 1;
        }
        System.out.println("Число - " + dB + "; Месяц - " + mB + "; Год - " + yB);
    }
}
