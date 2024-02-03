package LibrarymanagementSystem;

public class DriverCode {
	// DriverCode(execution starts from here)
 public static void main(String[] args) {
	// adding the first Book
	Book firstBook = new Book(1, "C", "Dennis Ritchie","Theory","10-10-1972");
	firstBook.BookInfoDisplay();
	System.out.println();
	
	// adding the second book
	Book secondBook = new Book(2, "C++", "Bjarne Stroustrup","Theory","10-10-1979");
	secondBook.BookInfoDisplay();
	System.out.println();
	
	// adding the third book
	Book thirdBook = new Book(3, "Java", "James Gosling", "Wikipedia", "19-10-1995");
	thirdBook.BookInfoDisplay();

	// creating the object of the library
	Library library=new Library();
	
	// library add the book
	library.addBook(firstBook, 6);
	System.out.println();
	library.addBook(secondBook, 1);
	
	System.out.println();
	library.addBook(thirdBook, 1);
	System.out.println();
	
	library.displayAllBooks();
	
	// searching the book,search by using the author name 
	library.searchBookByAuthor(secondBook, "James Gosling");
	System.out.println(library.issueBook(2));
	
	// displaying the all the books of the library
	library.displayAllBooks();
	
	System.out.println(library.issueBook(2));
	
	// checking the reserved books are their
	if(library.reserveBook()==true)
	{
        BooksReservedObbservable booksComing = new BooksReservedObbservable();
		
        
		Notification observer1 = new MobileAlert(10,"Manu", "7658080669");
		Notification observer2 = new MobileAlert(11,"Rajesh","9373773737");
        // adding the observer who are looking for book whenever new books are coming
        booksComing.add(observer1);
        booksComing.add(observer2);
        
        booksComing.setStockCount(10);
        // updating the count of that books which are stocked out
        library.addBook(secondBook, 10);
	}
	// displaying all the books
	library.displayAllBooks();
}
}
