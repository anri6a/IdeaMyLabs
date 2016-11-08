package Lab2;
import java.util.Scanner;
/*
 * 1 Задание - в произвольной строке считаем количество символов, разделяем ее на 2 подстроки,
 * которые выводим на принт.
 */

public class TwoStrings {

	private static Scanner enterString;

	public static void main(String[] args) {
		enterString = new Scanner(System.in);
			System.out.println("Введите произвольную строку и нажмите Enter");		//решил ввести ее с консоли
			String str1;
		str1=enterString.nextLine();
		//String str1=new String("jklsdhglsdmnlwfieflsdkki84938ur48urwoeifj848");
			System.out.println(str1);
		int str1Lenght=str1.length();
			System.out.println("В строке "+str1Lenght+" символа(ов)");
		int halfNum=str1Lenght/2;
			System.out.println("половина символов "+halfNum);
		String firstSubStr=str1.substring(0, halfNum);
		String secondSubStr=str1.substring(halfNum, str1Lenght-1);
		System.out.println("Первая половина строки - "+firstSubStr);
		System.out.println("Вторая половина строки - "+secondSubStr);
		
	}

}
