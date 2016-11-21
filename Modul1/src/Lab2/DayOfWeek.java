package Lab2;

import java.util.Scanner;

/*
 * 7 задание на вывод названия дня недели по введенному номеру дня
 */
public class DayOfWeek {
	private static Scanner EnterDay;

	public static void main(String[] args) {
		EnterDay = new Scanner(System.in);
		int enterDay;
		System.out.println("Ведите номер дня недели 1-7");
		enterDay = EnterDay.nextInt();
		switch (enterDay) {
		case 1:
			System.out.println("Этот день - понедельник");
			break;
		case 2:
			System.out.println("Этот день - вторник");
			break;
		case 3:
			System.out.println("Этот день - среда");
			break;
		case 4:
			System.out.println("Этот день - четверг");
			break;
		case 5:
			System.out.println("Этот день - пятница");
			break;
		case 6:
			System.out.println("Этот день - суббота");
			break;
		case 7:
			System.out.println("Этот день - воскресенье");
			break;
		default:
			System.out.println("Дня недели с таким номером не существует");
			break;
		}

	}

}
