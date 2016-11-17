package Lab4;

import java.util.Scanner;

/**
 * 1st task - print string with 2 gaps between symbols and in second line print
 * numbers of symbols from ABC
 * 
 * @author anri6a
 *
 */
public class LetReplNumb {
	private static Scanner enterString;

	public static void main(String[] args) {
		enterString = new Scanner(System.in);
		System.out.println("Enter String for Work");
		String enterStr;
		enterStr = enterString.nextLine();
		for (char gapDoubl : enterStr.toCharArray()) {
			System.out.printf("%3s|", gapDoubl); // for print line from АБВ
													// should be "%4s|"
		}
		System.out.println();
		for (char numb : enterStr.toCharArray()) {
			System.out.printf("%3d|", (int) numb); // for print line from АБВ
													// should be "%4s|"
		}
		System.out.println();
	}
}
