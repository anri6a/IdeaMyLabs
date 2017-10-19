package myLabs;

import java.util.Scanner;

/**
 * Created by 12 on 18.10.2017.
 */
public class Rubls {
    public static void main (String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("введите сумму");
        String scanInput=scan.nextLine();
        int userInput=Integer.parseInt(scanInput);
        int uI=userInput%10;
        if (userInput%100>=10&&userInput%100<=19)
            System.out.println(userInput+" рублей");
        /*else if (userInput%10==5||userInput%10==6||userInput%10==7||userInput%10==8||userInput%10==9)
            System.out.println(userInput+" рублей");*/
        else
            switch (uI){
                case (2):
                    System.out.println(userInput+" рубля");
                    return;
                case (3):
                    System.out.println(userInput+" рубля");
                    return;
                case (4):
                    System.out.println(userInput+" рубля");
                    return;
                /*case (5):
                    System.out.println(userInput+" рублей");
                    return;
                case (6):
                    System.out.println(userInput+" рублей");
                    return;
                case (7):
                    System.out.println(userInput+" рублей");
                    return;
                case (8):
                    System.out.println(userInput+" рублей");
                    return;
                case (9):
                    System.out.println(userInput+" рублей");
                    return;*/
                default:
                    System.out.println(userInput+" рублей");
            }

    }
}
