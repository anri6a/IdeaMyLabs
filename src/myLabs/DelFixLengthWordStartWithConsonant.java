package myLabs;

public class DelFixLengthWordStartWithConsonant {
    public static void main(String args[]) {
        String testStr = "sgfskj erty sfghksjv Gkjhsksvj cvbn jHjhkjvksv";
        int siseOfWord = 4;
        /*Scanner enterString = new Scanner(System.in);
        System.out.println("Enter sentence for work");
        String enterStr = enterString.nextLine();
        enterString.close();
        System.out.println("\nNew clear sentence will be");
        System.out.println(enterStr.replaceAll("\\b[qwrtpsdfghjklzxcvbnm]{1}.{1}\\b", ""));*/
        String[] wordsStr = testStr.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordsStr.length; i++) {
            char firstLatter = wordsStr[i].charAt(0);
            if (!((wordsStr[i].length() == siseOfWord) && ((firstLatter != 'a') && (firstLatter != 'e') &&
                    (firstLatter != 'i') && (firstLatter != 'o') && (firstLatter != 'u') && (firstLatter != 'y')))) {
                sb.append(wordsStr[i]).append(" ");
            }
        }
        String outputStr = sb.toString().trim();
        System.out.println(outputStr);
    }
}
