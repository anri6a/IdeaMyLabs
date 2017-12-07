package myLabs.Bankomat;

import java.util.Scanner;

public class BankomatMenu {
    BankomatLogic logic = new BankomatLogic();

    public void menuScanner() {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("Добро пожаловать в банкомат! \n выберите действие: \n 1.Просмотреть счет" +
                    "\n 2.Пополнить счет\n 3.Снять со счета\n 4.\n 5.Закончить работу");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    logic.viewCount();
                    break;
                case 2:
                    logic.putMoneyCount();
                    break;
                case 3:
                    logic.withDrawMoneCount();
                    break;
                case 5:
                    sc.close();
                    break;
            }

        }
        while (input != 5);
    }
}
