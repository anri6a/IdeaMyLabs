package myLabs;

/**
 * Created by 12 on 14.11.2017.
 * print diagonal elements
 */
public class DiagElementsArr {
    public static void main(String args[]) {
        int n = 5;
        int k = 0, l = 0;
        int[] res1 = new int[n];
        int[] res2 = new int[n];
        int[][] arr = new int[n][n];
        int[] res = new int[n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                if (i == j) {
                    res1[k] = arr[i][j];
                    k++;
                }
                System.out.println("");
                if (i + j == n - 1) {
                    res2[l] = arr[i][j];
                    l++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
        for (int i = 0; i < res1.length; i++) {
            System.out.print(res1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < res2.length; i++) {
            System.out.print(res2[i] + " ");
        }
    }
}

