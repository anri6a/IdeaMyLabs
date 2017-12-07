package myLabs.Bankomat;

import java.util.Scanner;

public class BankomatLogic {
    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    private int vvod;
    Scanner enter = new Scanner(System.in);

    int putMoneyCount() {
        System.out.println("банкомат принимает только банкноты по 20 50 100 рублей");
        System.out.println("введите сумму для пополнения баланса");
        vvod = enter.nextInt();
        count += vvod;
        return count;
    }

        int withDrawMoneCount(){
            System.out.println("банкомат выдает только банкноты по 20 50 100 рублей");
            System.out.println("Какую суммы вы хотите снять?");
            vvod=enter.nextInt();
            ostatok();
            count-=vvod;
            return count;
    }
//    boolean checkNominals(){
//
//    }
    int ostatok(){
            do {
                if (vvod > count) {
                    System.out.println("недостаточно средств \n введите новую сумму");
                    vvod = enter.nextInt();
                }
            }
            while (vvod>count);
        return vvod;
    }
    void viewCount() {
        System.out.println("ваш текущий баланс " + count);
    }
}
