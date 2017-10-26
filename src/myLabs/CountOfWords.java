package myLabs;

/**
 * Created by 12 on 26.10.2017.
 * Count up words in string
 */
public class CountOfWords {
    public static void main(String args[]) {
        String str = "kjdfg sdrgf sregi oiuhkj kj j ";
        int count = str.split(" +").length;
        System.out.println("Колличество слов - " + count);
    }
}
