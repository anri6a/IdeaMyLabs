package myLabs;

/**
 * Created by 12 on 24.10.2017.
 * Easy sorting by direct choice
 */
public class DirectChoiceSort {
    public static void main (String [] args){
        int m;
        int n=(int)(Math.random()+10);
        int marks[]=new int[n]; //{4,5,2,5,7,6,8,9,12,34,56,78,90,54,21,55};
        for (int mas=0; mas<marks.length; mas++){
            marks[mas]=(int)(Math.random()*10+1);
            System.out.print(marks[mas]+"|");
        }
        System.out.println('\n');

        for (int i=0; i<marks.length; i++){
            m=i;
            for (int j=i; j<marks.length; j++){
                if (marks[m]<marks[j])
                    m=j;
            }
            int t;
            t=marks[m];
            marks[m]=marks[i];
            marks[i]=t;
            System.out.print(marks[i]+"|");
        }

    }
}
