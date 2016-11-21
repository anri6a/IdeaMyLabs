package Lab3;

import java.util.*;

/**
 * 2-е задание на нахождение в int массиве минимального и максимального значения
 *
 * @author anri6a
 *
 */
public class MinMaxArr {

	public static void main(String[] args) {
		int workArr[] = new int[15];
		for (int i = 0; i < workArr.length; i++) {
			workArr[i] = (int) (Math.random() * 1000);
			System.out.printf("%03d|", workArr[i]);
		}
		Arrays.sort(workArr);
		System.out.printf("\n\n%s%3d", "min value - ", workArr[0]);
		System.out.printf("\nmax value - " + workArr[workArr.length - 1]);
	}

}
