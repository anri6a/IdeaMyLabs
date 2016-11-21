package Books;

import java.util.Scanner;

class Menu {
	public static Scanner yourChoice;

	public String Choice() {
		yourChoice = new Scanner(System.in);
		System.out.println("Нажмите 1,\nесли хотите вывести список книг одного автора\n\n"
				+ "Нажмите 2,\nесли хотите вывести список книг одного издательства\n\n"
				+ "Нажмите 3,\nесли хотите вывести список книг выпущенных после ХХХХ года\n");
		String firstChoice = yourChoice.nextLine();

		switch (firstChoice) {
		case "1":
			System.out.println("какого автора вы выбираете:");
			String secondChoiceAuthor = yourChoice.nextLine();
			firstChoice = secondChoiceAuthor;
			break;
		case "2":
			System.out.println("какое издательство вы выбираете:");
			String secondChoicePubHouse = yourChoice.nextLine();
			firstChoice = secondChoicePubHouse;
			break;
		case "3":
			System.out.println("после какого года книги вас интересуют:");
			String secondChoiceYear = yourChoice.nextLine();
			firstChoice = secondChoiceYear;
			break;
		default:
			System.out.println("вы выбрали неправильно");
			break;
		}
		return firstChoice;

	}

}
