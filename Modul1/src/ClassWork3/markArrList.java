package ClassWork3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class markArrList {

	public static void main(String[] args) {
		List<Integer> marksList=new ArrayList<Integer>();
		for (int i=1; i<15; i++){
			marksList.add((int)(Math.random()*10+1));
			System.out.println(marksList);
		}
		Iterator<Integer> iterMark=marksList.iterator();
		while (iterMark.hasNext()){
			Integer i = iterMark.next();
			if (i<=3){
				iterMark.remove();
				System.out.println(marksList);
			}
		}
		/*ArrayList<Integer> marksList = getRandomNumber();
	}

	private static ArrayList<Integer> getRandomNumber() {
		
		return null;
		*/
	}
	
}
