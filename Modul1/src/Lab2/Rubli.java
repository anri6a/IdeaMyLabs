package Lab2;
import java.util.Scanner;
public class Rubli {
	private static Scanner enterRubli;
	public static void main(String[] args) {
		enterRubli=new Scanner(System.in);
		int rubli;
		System.out.println("Введите колличество денег");
		rubli=enterRubli.nextInt();
		/*boolean ends1=rubli.endsWith("1");
		if (ends1){
			System.out.println(rubli+" рубль");
		}*/
		
		//String rubliStr=Integer.toString(rubli);
		//char lastNumb=rubliStr.charAt(rubliStr.length()-1);
		int lastNumbInt=rubli%10;
		System.out.println("Last - "+lastNumbInt);
		if (rubli>=11||rubli<=20) {
			System.out.println(rubli+" рублей");
		} else if (lastNumbInt==2||lastNumbInt>2||lastNumbInt==4||lastNumbInt<4) {
			System.out.println(rubli+" рубля");
		} else if (lastNumbInt==5||lastNumbInt>5||lastNumbInt==9||lastNumbInt<9) {
			System.out.println(rubli+" рублей");
		} else if (lastNumbInt==1) {
			System.out.println(rubli+" рубль");
	}  
}
}
