package Lab4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 5th task - is the one String like permutation of other String
 * 
 * @author anri6a
 *
 */
public class PermutString {
	private static Scanner enterString;

	public static void main(String[] args) {
		enterString = new Scanner(System.in);
		System.out.println("Enter First String");
		String enterFirstStr = enterString.nextLine();
		System.out.println("Enter Second String");
		String enterSecStr = enterString.nextLine();
		char[] firstStrChar = enterFirstStr.toCharArray();
		Arrays.sort(firstStrChar);
		enterFirstStr = String.valueOf(firstStrChar);
		char[] secondStrChar = enterSecStr.toCharArray();
		Arrays.sort(secondStrChar);
		enterSecStr = String.valueOf(secondStrChar);
		// System.out.println(con2);
		if (enterFirstStr.equals(enterSecStr)) {
			System.out.println("Strings are same - characters swapped");
		} else
			System.out.println("It is not permutation of symbols");
	}
}
