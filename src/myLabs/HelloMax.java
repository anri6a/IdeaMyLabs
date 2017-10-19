package myLabs;

import java.util.Scanner;

/**
 * Output Name from console as "Привет ...!"
 * Created by 12 on 17.10.2017.
 */
public class HelloMax {
    public static void main (String [] args){
        System.out.println("Веедите свое имя");
        Scanner name = new Scanner(System.in); // create new exemplar of Scanner
        String scanName=name.nextLine();        // create new variable for user input
        System.out.println("Привет "+scanName+"!");
    }
}
