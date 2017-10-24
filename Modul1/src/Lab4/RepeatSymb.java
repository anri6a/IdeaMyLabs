package Lab4;

import java.util.Scanner;

/**
 * 4th task - how many times repeat some symbol
 * 
 * @author anri6a
 *
 */
public class RepeatSymb {
	private static Scanner workString;

	public static void main(String[] args) {
		workString = new Scanner(System.in);
		System.out.println("Enter String for Work");
		String enterStr = workString.nextLine();
		workString.close();
		int symbArr[] = new int[255];
		for (int i = 0; i < enterStr.length(); i++) {
			symbArr[enterStr.charAt(i)]++;
		}
		for (int i = 0; i < 255; i++) {
			if (symbArr[i] > 1) {
				System.out.println((char) i + " - repeat " + symbArr[i] + " times");
			}
		}
	}
}
