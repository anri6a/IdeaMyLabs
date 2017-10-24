package Lab3;
/**
 * 6th task was - all zero elements put the end of array without changing
 * numbers of other elements 
 * @author anri6a
 *
 */
public class ReplaceZero {

	public static void main(String[] args) {
		int workArr[];
		workArr = new int[10];
		int n = 0;
		System.out.println("New Random Array is:");
		for (int i = 0; i < workArr.length; i++) {
			workArr[i] = (int) (Math.random() * 10 - 2);
			System.out.printf("%2d|", workArr[i]);
		}
		for (int i = 0; i < workArr.length - 1 - n; i++) {
			if (workArr[i] == 0) {
				n++;
				for (int j = i; j < workArr.length - 1; j++) {
					workArr[j] = workArr[j + 1];
				}
				workArr[workArr.length - 1] = 0;
			}
		}
		System.out.println("\nChanged Array is:");
		for (int i = 0; i < workArr.length; i++) {
			System.out.printf("%2d|", workArr[i]);
		}
	}
}
