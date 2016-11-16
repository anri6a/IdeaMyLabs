package Lab3;

/**
 * 5-е задание на вывод произведения элементов массива до первого нуля
 * 
 * @author anri6a
 *
 */
public class MultiplBeforeZero {

	public static void main(String[] args) {
		int workMass[];
		workMass = new int[15];
		int multipl = 1;
		for (int i = 0; i < workMass.length; i++) {
			workMass[i] = (int) (Math.random() * 10);
			System.out.print("|" + workMass[i]);

		}
		for (int j = 0; j < workMass.length & workMass[j] != 0; j++) {
			multipl *= workMass[j];
		}
		System.out.print("\nПроизведение до первого 0 = " + multipl);
	}

}
