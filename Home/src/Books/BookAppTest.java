package Books;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BookAppTest {

	public static void main(String[] args) throws FileNotFoundException {
		List<Book> books = new ArrayList<Book>();
		try (Scanner newLineScann = new Scanner(new File("d:/labs/ItAcademy/files/books.txt"))) {
			while (newLineScann.hasNextLine()) {
				// line.add(newLineScann.nextLine());
				// System.out.println(line);
				books.add(createBook(newLineScann.nextLine()));
			}
		}
		// newLineScann.close();
		// System.out.println(line.get(1));
		Menu result = new Menu();
		System.out.println(result.Choice());

	}

	public String selectFromListAuthor(String firstChoice) {
		for (Book sortedElement : book.getAuthor()) {

		}
		return firstChoice;
	}

	public String selectFromListPubHouse(String firstChoice) {
		return firstChoice;
	}

	public Integer selectFromListYear(Integer firstChoice) {
		return firstChoice;
	}

	private static Book createBook(String nextLine) {
		Book book = new Book();
		String[] fieldsArr = nextLine.split(",");
		if (fieldsArr != null) {
			book.setId(Integer.valueOf(fieldsArr[0]));
			book.setName(fieldsArr[1]);
			book.setAuthor(fieldsArr[2]);
			book.setPubHouse(fieldsArr[3]);
			book.setPubYear(Integer.valueOf(fieldsArr[4]));
			book.setPages(Integer.valueOf(fieldsArr[5]));
			book.setPrice(Integer.valueOf(fieldsArr[6]));
			book.setBinding(fieldsArr[7]);
		}
		System.out.println(book);
		return book;

	}

}
