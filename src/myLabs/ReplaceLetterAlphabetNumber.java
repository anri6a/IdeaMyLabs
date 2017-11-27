package src.myLabs;
/*
* Replace Latin Letters with Alphabet Numbers
*/

public class ReplaceLetterAlphabetNumber {
    public static void main (String args[]){
        String testStr="skjfghs sfkjhgksjf skjvek!";
        String codeStr="";
        String finalStr="";
        for (char ch:testStr.toCharArray()) {
            codeStr+=Character.isAlphabetic(ch)?String.format("%-3s",ch-'a'+1):ch;
            finalStr+=Character.isAlphabetic(ch)?String.format("%-3s",ch):ch;

        }
        System.out.println(codeStr);
        System.out.println(finalStr);
    }
}
