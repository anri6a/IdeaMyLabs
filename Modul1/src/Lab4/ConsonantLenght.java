package Lab4;

import java.util.Scanner;

/**
 * 3rd task - delete from sentence 2-letters words that begin on Consonant
 * 
 * @author anri6a
 *
 */
public class ConsonantLenght {
	private static Scanner enterString;

	public static void main(String[] args) {
		enterString = new Scanner(System.in);
		System.out.println("Enter sentence for work");
		String enterStr = enterString.nextLine();
		enterString.close();
		System.out.println("\nNew clear sentence will be");
		System.out.println(enterStr.replaceAll("\\b[qwrtpsdfghjklzxcvbnm]{1}.{1}\\b", ""));
	}
}
