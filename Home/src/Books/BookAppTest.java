package Books;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookAppTest {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> line = new ArrayList<String>();
		Scanner newLineScann = new Scanner(new File("d:/labs/ItAcademy/files/books.txt"));
		while (newLineScann.hasNextLine()) {
			line.add(newLineScann.nextLine());
			System.out.println(line);
		}
		newLineScann.close();
System.out.println(line.get(1));
	}

}
