package myLabs;

/**
 * Created by 12 on 20.11.2017.
 */
public class AscendingOrderDiagonal {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int q = 0; q < array.length; q++) {
            for (int q1 = 0; q1 < array[q].length; q1++) {
                array[q][q1] = (int) (Math.random() * 9 + 1);
                System.out.printf("%3d", array[q][q1]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            int m = i;
            for (int j = i; j < array[i].length; j++) {
                if (array[m][m] < array[j][j]) {
                    m = j;
                }
            }
            int t;
            t = array[m][m];
            array[m][m] = array[i][i];
            array[i][i] = t;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                System.out.printf("%3d", array[i][k]);
            }
            System.out.println();
        }
    }
}
