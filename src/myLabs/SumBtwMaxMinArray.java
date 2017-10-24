package myLabs;

/**
 * Created by 12 on 24.10.2017.
 * Find summ elements between max and min element of array
 */
public class SumBtwMaxMinArray {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10 + 10);
        int mas[] = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
            System.out.print(mas[i] + "|");
        }
        System.out.println('\n');
        int maxI = -1;
        int minI = 1000;
        int t = 0;
        for (int i = 0; i < mas.length; i++) {
            if (t < mas[i]) {
                maxI = i;
                t = mas[i];
            }
        }
        for (int i = 0; i < mas.length; i++) {
            if (t > mas[i]) {
                minI = i;
                t = mas[i];
            }
        }
        System.out.println("MAX= " + mas[maxI]);
        System.out.println("MIN= " + mas[minI]);
        int sum = 0;
        if (maxI > minI) {
            for (int i = minI + 1; i < maxI; i++)
                sum = sum + mas[i];
        } else {
            for (int i = maxI + 1; i < minI; i++)
                sum = sum + mas[i];
        }
        System.out.println("Summ= " + sum);
    }
}

