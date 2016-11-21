package Lab3;

/**
 * 3-е задание на нахождение и вывод минимального элемента массива и его индекса
 * 
 * @author anri6a
 *
 */
public class MinIndex {

	public static void main(String[] args) {
		int workMass[];
		int ind = 0;
		int maxVal = 100; // переменная для задания верхнего диапазона значений
							// рабочего массива
		int min = maxVal;
		workMass = new int[15];
		for (int i = 0; i < workMass.length; i++) {
			workMass[i] = (int) (Math.random() * maxVal);
			System.out.print("|" + workMass[i]);
			if (min > workMass[i]) {
				min = workMass[i];
				ind = i;

			}

		}
		System.out.println("\n Минимальный элемент массива = " + min + 
				"\n Индекс минимального элемента - " + ind);
	}
}
