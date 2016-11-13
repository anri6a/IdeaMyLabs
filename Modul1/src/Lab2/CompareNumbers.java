package Lab2;

import java.util.Scanner;

/*
 * 2 задание на сравнение двух, введенных с клавиатуры чисел
 */
public class CompareNumbers {
	private static Scanner enterNum;

	public static void main(String[] args) {
		enterNum = new Scanner(System.in);
		System.out.println("Enter first and second number");
		int firstNum, secondNum;
		firstNum = enterNum.nextInt();
		secondNum = enterNum.nextInt();
		if (firstNum > secondNum) {
			System.out.println("1>2");
		} else if (firstNum < secondNum) {
			System.out.println("1<2");
		} else {
			System.out.println("1=2");
		}
	}
}
