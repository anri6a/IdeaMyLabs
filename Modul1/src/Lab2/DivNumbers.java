package Lab2;

import java.util.Scanner;

/*
 * 3 задание на вычисление частного двух чисел
 */
public class DivNumbers {
	private static Scanner enterNum;

	public static void main(String[] args) {
		enterNum = new Scanner(System.in);
		double firstNum, secondNum;
		System.out.println("Enter numbers");
		firstNum = enterNum.nextDouble();
		secondNum = enterNum.nextDouble();
		double result = firstNum / secondNum;
		System.out.printf("Result of division is - %.3f", result); //выводим с точностью 3 цифры после запятой
																
	}

}
