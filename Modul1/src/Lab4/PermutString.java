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
		char[] con1 = enterFirstStr.toCharArray();
		Arrays.sort(con1);
		enterFirstStr = String.valueOf(con1);
		char[] con2 = enterSecStr.toCharArray();
		Arrays.sort(con2);
		enterSecStr = String.valueOf(con2);
		// System.out.println(con2);
		if (enterFirstStr.equals(enterSecStr)) {
			System.out.println("Strings are same - characters swapped");
		} else
			System.out.println("It is not permutation of symbols");
	}
}
