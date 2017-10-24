package Lab3;
/**
 * 4-е задание на подсчет колличества отрицательных элементов массива
 * @author anri6a
 *
 */
public class NegativeElem {

	public static void main(String[] args) {
		int workMass[];
		int k = 0;
		workMass = new int[15];
		for (int i = 0; i < workMass.length; i++) {
			workMass[i] = (int) (Math.random() * 20 - 10);
			System.out.printf("%2d|", workMass[i]);
			if (workMass[i] < 0) {
				k +=1;
			}

		}
		System.out.println("\nКолличество отрицательных элементов = " + k);
	}

}
