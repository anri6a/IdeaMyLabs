package myLabs;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

/**
 * Created by 12 on 26.10.2017.
 * Count up all punctuation marks in input string
 */
public class StringWithoutPunctMarks {
    public static void main(String[] args) {
        String str = "jh, .. ?? ) 9  dfk #4^& gjn0 *(&5 298!!3!7><?";
        int before = str.length();
        int after = str.replaceAll("[,.?#$%^&<>!*]", "").length();
        System.out.println("Количество знаков препинания в строке - " + (before - after));
    }
}
