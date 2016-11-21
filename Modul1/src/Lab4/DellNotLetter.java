package Lab4;

import java.util.Scanner;
/**
 * 3rd task - delete from String all symbols, except gaps and letters
 * @author anri6a
 *
 */
public class DellNotLetter {
	private static Scanner enterString;

	public static void main(String[] args) {
		enterString = new Scanner(System.in);
		System.out.println("Enter string for Work");
		String enterStr = enterString.nextLine();
		enterString.close();
		System.out.println("\nNew modified String is\n");
		System.out.println(enterStr.replaceAll("\\p{Punct}", "")); // \p{Punct}-все
																	// символы
																	// пунктуации
	}
}
