package Lab1;
import java.util.Scanner;
public class HelloMax {

	public static void main(String[] args) {
		Scanner scKeyboard = new Scanner (System.in);
		String nameIn;
		System.out.println("ВВеди свое имя и нажми ENTER");
		nameIn=scKeyboard.nextLine();
		System.out.println("Привет, "+nameIn+"!");

	}

}
