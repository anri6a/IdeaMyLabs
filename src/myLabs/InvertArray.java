package myLabs;

/**
 * Created by 12 on 24.10.2017.
 * Invert total random array
 * Print initial and final arrays
 */
public class InvertArray {
    public static void main(String[] args) {
        int t;
        int mas[];
        int n = (int) (Math.random() * 10 + 10);
        System.out.println("Элементов " + n);
        mas = new int[n];
        for (int m = 0; m < mas.length; m++) {
            mas[m] = (int) (Math.random() * 10);
            System.out.print(mas[m] + "|");

        }
        System.out.println('\n');
        for (int i = 0; i <= mas.length / 2; i++) {
            t = mas[i];
            mas[i] = mas[(mas.length - 1) - i];
            mas[(mas.length - 1) - i] = t;
        }
        for (int j = 0; j < mas.length; j++)
            System.out.print(mas[j] + "|");

    }
}
