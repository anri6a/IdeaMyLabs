package Lab3;
/**
 * 1-е задание на создание массива, его ворматированный вывод и
 * расчет среднего арифметического всех этементов массива
 * @author anri6a
 *
 */
public class FormatOutArr {

	public static void main(String[] args) {
		float mas[];
		float sum = 0;
		mas = new float[10];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (float) (Math.random() * 10 + 1);
			System.out.printf("%.03f|", mas[i]);
			sum = sum + mas[i];
		}
		System.out.println("\n\nСумма элементов масссива = " + sum);
		System.out.println("\naverage value is - " + sum / mas.length);
	}

}
