package Lab2;

import java.util.Scanner;

/*
 * 4 задание на определение високосности, введенного с консоли года
 */
public class LeapYear {
	private static Scanner enterYear;

	public static void main(String[] args) {
		enterYear = new Scanner(System.in);
		System.out.println("Enter your Year");
		int inputYear = enterYear.nextInt();
		if (inputYear % 4 == 0 && inputYear % 100 != 0 || inputYear % 400 == 0) {
			System.out.println("This Year is Leap!!!");
		} else {
			System.out.println("Sorry, This Year in not Leap...");
		}

	}

}
