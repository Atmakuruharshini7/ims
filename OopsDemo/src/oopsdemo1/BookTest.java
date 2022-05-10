package oopsdemo1;

public class BookTest {

	public static void main(String[] args) {
		
		Book b1=new Book();
		Book b2=new Book();
		//ivoke setter method-input
		b1.setBookId(101);
		b1.setBookName("Programming in C");
		b1.setPrice(500);
		b1.setPublisher("Prime Books");
		
		//invoke getter methods--output
		System.out.println("********book details**********");
		b1.display();
		System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
		System.out.println("discount price of book: "+b1.discountPrice());
		System.out.println(b1);//invokes to string method
		
		//ivoke setter method-input
				b2.setBookId(101);
				b2.setBookName("Python");
				b2.setPrice(1000);
				b2.setPublisher("Primefcggvh Books");
		
				System.out.println("********book details**********");
				b2.display();
				System.out.println(b2.getBookId()+" "+b2.getBookName()+" "+b2.getPrice()+" "+b2.getPublisher());
				System.out.println("discount price of book: "+b2.discountPrice());
				System.out.println(b2);//invokes to string method

	}

}
