package bookpackext;
import bookpack.*;

class UseBook {
	public static void main(String[ ] args) {
		Book[ ] books = new Book[3];

		books[0] = new Book("A", "X", 0);
		books[1] = new Book("B", "Y", 1);
		books[2] = new Book("C", "Z", 2);

		for (Book book: books)
			book.show();
	}
}
