package Lab1;

import java.util.Scanner;

public class HelloMax {

	private static Scanner scKeyboard;

	public static void main(String[] args) {
		scKeyboard = new Scanner(System.in);
		String nameIn;
		System.out.println("ВВеди свое имя и нажми ENTER");
		nameIn = scKeyboard.nextLine();
		System.out.println("Привет, " + nameIn + "!");

	}

}
