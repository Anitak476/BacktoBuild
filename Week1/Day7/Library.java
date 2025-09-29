// Week1 Day7 - Simple Library Project
class Book
{
String title;
Book(String title);
this.title=title;
void printTitle()
{
  System.out.println(title);
}
}

class Library{
	ArrayList<Book> books=new ArrayList<>();
	void addBook(Book B)
	{
 		books.add(b);
	}
	void showBooks()
	{
 		for(Book b.books)
		{
 		b.printTitle();
		}
	}

}

public class MainLibrary{
	public static void main(String[]args)
	{
 		Library lib=new Library();
		lib.addBook(new Book("Java Basics"));
		lib.addBook(new Book("Selenium Guide"));
		lib.addBook(new Book("OOP Concepts"));
		System.out.println("Library books:");
		lib.showBooks();
	}
}
