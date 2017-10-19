package myLabs;

/**
 * Created by 12 on 19.10.2017.
 */
public class IncreasingTriangle {
    public static void main (String []args){
        /*for (int i=0; i<=10; i++){
            for (int j=0; j<10-i *//*i*//*; j++){
                System.out.print(" 1");
            }
            System.out.println("");
        }*/
        for (int i=1; i<=10; i++){
            for (int j=1; j<=i; j++){
                if (j<i-10)
                    break;
                System.out.print("1 ");
            }
            System.out.println("");
        }
    }
}
