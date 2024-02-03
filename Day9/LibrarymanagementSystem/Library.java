package LibrarymanagementSystem;

import java.util.HashMap;


// create the class of the Library
public class Library {
	
	// create the instance variables of the library
	private String libraryNameString;
	private String librarianNameString;
	HashMap<Book, Integer> storageHashMap;
	private int totalNumberOfBooksPresent;
	
	public Library()
	{
		 this.storageHashMap=new HashMap<>();
	}
	// create the constructor of the library class
	public Library(String libraryNameString,String librarianNameString)
	{
		this.libraryNameString=libraryNameString;
		this.librarianNameString=librarianNameString;
		this.storageHashMap=new HashMap<>();
	}
	
	// add the book
	public void addBook(Book books ,int count)
	{
		storageHashMap.put(books,count);
		this.totalNumberOfBooksPresent+=count;
		System.out.println("Your Book is added.....");	
	}
	
	//serch book by author
	public void searchBookByAuthor(Book book, String nameoAuthor)
	{
       for(Book bookInfo:storageHashMap.keySet())
       {
    	   if(bookInfo.getAuthorOfTheBook()==nameoAuthor)
    	   {
    		   System.out.println("The given author book is found");
    		   return;
    	   }
       }
       System.out.println("The given author book is not found");
	}
	
	// search book by title
	public void serachBookByTitle(String titleOfTheBook)
	{
		 for(Book bookInfo:storageHashMap.keySet())
		 {
			 if(bookInfo.getTitleOfTheBook()==titleOfTheBook) {
			 System.out.println("The given title book is found");
			 return;
			 }
		 }
		 System.out.println("The given title book is not found");
	}
	
	// search book by subject category
	public void serachBookBySubjectCategory(String subjectCategory)
	{
		for(Book bookInfo:storageHashMap.keySet())
		 {
			if(bookInfo.getSubjectCategoryOfTheBook()==subjectCategory) {
			 System.out.println("The given title book is found");
			 return;
			}
		 }
		 System.out.println("The given title book is not found");	
	}

	
    public void registerMember(LibraryMember member) {
        // Implementation to register a new member
    }

    

    public void checkOutBook(int memberId, int bookItemId) {
        // Implementation to check out a book by a member
    }

    public boolean reserveBook() {
    	for(Book bookInfo:storageHashMap.keySet())
		{
    		if(storageHashMap.get(bookInfo)==0)
    		{
    			System.out.println("The Book is at reseved position : "+bookInfo.getAuthorOfTheBook());
    			 return true;
    		}
		}
    	return false;
    }

    public void renewBook(int memberId, int bookItemId) {
        // Implementation to renew a checked-out book by a member
    }

    // return a book
    public void returnBook(int bookItemID) {     
    	for(Book bookInfo:storageHashMap.keySet())
		{
    		if(bookInfo.getBookID()==bookItemID)
    		{
    			storageHashMap.put(bookInfo,storageHashMap.get(bookInfo)+1);
    		}
		}
    }
     
    // issue a book
    public boolean issueBook(int bookItemID)
    {
    	for(Book bookInfo:storageHashMap.keySet())
		{
    		if(bookInfo.getBookID()==bookItemID && storageHashMap.get(bookInfo)>0)
    		{
    			storageHashMap.put(bookInfo,storageHashMap.get(bookInfo)-1);
    			return true;
    		}
		}
    	return false;
       
    }
	
    // displaying all the books
	public void displayAllBooks()
	{
		for(Book bookInfo:storageHashMap.keySet())
		{
			System.out.println("The ID of the book is : "+bookInfo.getBookID());
			System.out.println("The author of the book is : "+bookInfo.getAuthorOfTheBook());
			System.out.println("The subject category of the book is :"+bookInfo.getSubjectCategoryOfTheBook());
			System.out.println("The title of the book is :"+bookInfo.getTitleOfTheBook());
			System.out.println("The rack number of book is placed : "+bookInfo.getRackNumberWhereBookPlaced());
			System.out.println("The publication date of is : "+bookInfo.getPublicationDateString());
			System.out.println("The count of Book is : "+storageHashMap.get(bookInfo));
			System.out.println();
		}	
	}
	
	
	

}
