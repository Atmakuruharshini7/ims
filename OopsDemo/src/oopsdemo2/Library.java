package oopsdemo2;
//composition example
import java.util.List;
public class Library {
	List<Book> books;

	public Library(List<Book> books) {
		this.books = books;
	}
//only getters..source->slect getters and setter->select getters
	public List<Book> getBooks() {
		return books;
	}
}
