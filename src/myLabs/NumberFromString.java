package myLabs;

/**
 * Created by 12 on 25.10.2017.
 * Find all numbers from string
 */
public class NumberFromString {
    public static void main(String[] args) {
        String s = "x=15, y=3, z=459";
        String sn = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sn += s.charAt(i);
            } else {
                if (!sn.equals("")) {
                    System.out.println(sn);
                    sn = "";
                }
            }
        }
        if (!sn.equals(""))
            System.out.println(sn);
    }
}
