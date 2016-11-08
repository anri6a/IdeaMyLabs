package Lab2;
import java.util.Scanner;
/*
 * 5 задание по вычислению оптимального весо-ростового показателя
 */
public class WeightHeight {
		private static Scanner enterParam;
	public static void main(String[] args) {
		enterParam=new Scanner(System.in);
		int weight, height;
		System.out.println("Введите ваш вес");
		weight=enterParam.nextInt();
		System.out.println("Введите ваш рост");
		height=enterParam.nextInt();
		if (weight>height-100 && weight !=height-100) {
			System.out.println("Вам необходимо похудеть!");
		} else if (weight<height-100 && weight !=height-100) {
			System.out.println("Вам необходимо поправиться");
		} else {
			System.out.println("Вы в отличной форме!!!");
		}
	}

}
