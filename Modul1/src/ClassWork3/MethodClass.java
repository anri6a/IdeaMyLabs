package ClassWork3;

public class MethodClass {

	public  char CreatArray() {
		int [] randomArr= new int[15];
		for (int i=0;i<14;i++){
			randomArr[i]=(int)(Math.random()*10+1);
			System.out.println(randomArr[i]);
		}
		return 0;
				
	}

}
