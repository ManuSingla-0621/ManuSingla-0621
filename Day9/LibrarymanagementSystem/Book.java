package LibrarymanagementSystem;


import java.util.Random;

// create the class of the Book
public class Book {

	// create a instance-variables of the Book
	private int bookID;
	private String titleOfTheBook;
	private String authorOfTheBook;
	private String subjectCategoryOfTheBook;
	private int rackNumberWhereBookPlaced;
	private String publicationDateString;
	
	// create the constructor of the book class
	public Book(int bookID,String titleOfTheBook,String authorOfTheBook,String subjectCategoryOfTheBook,String publicationDateString)
	{
	  this.bookID=bookID;
      this.authorOfTheBook=authorOfTheBook;
      this.subjectCategoryOfTheBook=subjectCategoryOfTheBook;
      this.titleOfTheBook=titleOfTheBook;
      this.rackNumberWhereBookPlaced=getRackNumberWhereBookPlaced();
      this.publicationDateString=publicationDateString;
	}
	
	// generates all the setters and getters to set the value and get the value
    // getting the bookID
	public int getBookID() {
		return bookID;
	}
 
	// setting the bookID
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	// getting the titleOfTheBook
	public String getTitleOfTheBook() {
		return titleOfTheBook;
	}
	
	// set the title of the Book
	public void setTitleOfTheBook(String titleOfTheBook) {
		this.titleOfTheBook = titleOfTheBook;
	}

	// getting the author of the book
	public String getAuthorOfTheBook() {
		return authorOfTheBook;
	}

	// setting the author of the book
	public void setAuthorOfTheBook(String authorOfTheBook) {
		this.authorOfTheBook = authorOfTheBook;
	}

	// getting the subject Category of the book
	public String getSubjectCategoryOfTheBook() {
		return subjectCategoryOfTheBook;
	}

	// setting the subject category of the book
	public void setSubjectCategoryOfTheBook(String subjectCategoryOfTheBook) {
		this.subjectCategoryOfTheBook = subjectCategoryOfTheBook;
	}

	// getting the rack number of the book
	public int getRackNumberWhereBookPlaced() {
		return new Random().nextInt(10);
	}

	// setting the rack number of the book
	public void setRackNumberWhereBookPlaced(int rackNumberWhereBookPlaced) {
		this.rackNumberWhereBookPlaced = rackNumberWhereBookPlaced;
	}

	// getting the publication date of the book
	public String getPublicationDateString() {
		return publicationDateString;
	}

	// setting the publication date of the book
	public void setPublicationDateString(String publicationDateString) {
		this.publicationDateString = publicationDateString;
	}
	
	// displaying the book information which is stored in library
	public void BookInfoDisplay()
	{
		System.out.println("Book ID : "+bookID);
		System.out.println("Title of the Book : "+titleOfTheBook);
		System.out.println("Category of the Book : "+subjectCategoryOfTheBook);
		System.out.println("Publication of the Book : "+publicationDateString);
		System.out.println("Author of the Book : "+authorOfTheBook);
		System.out.println("Rack number where book placed : "+rackNumberWhereBookPlaced);
	}
	

}
