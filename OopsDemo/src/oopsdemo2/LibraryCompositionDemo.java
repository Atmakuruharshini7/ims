package oopsdemo2;

import java.util.ArrayList;
import java.util.List;

public class LibraryCompositionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("effective java","joshua bloch");
		Book b2 = new Book("thinking java","bruce bloch");
		Book b3 = new Book("effective java","jdawda bloch");
	
	
	List<Book> books = new ArrayList()<Book>();
	books.add(b1);
	books.add(b2);
	books.add(b3);
	
	Library lib=new Library(books);
	for(Book bk : bks) {
		System.out.println("Title : "+bk.title+" and "+" Author : "+bk.author);
	}
	}

}
