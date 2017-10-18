package myLabs;

/**
 * Created by 12 on 17.10.2017.
 */
public class HoursMinutesSeconds {
    public static void main (String [] args){
        int x=5900;
        int h, m, s;
        h=x/3600;
        x=x%3600;
        m=x/60;
        s=x%60;
        System.out.println(h+"часов, "+m+"минут, "+s+"секунд");
    }
}
