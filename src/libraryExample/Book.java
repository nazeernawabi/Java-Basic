package libraryExample;

public class Book {

	
	private String tiltle;
	private String author;
	private int numberOfPages;
	private String isbn;
	private double price;
	
	
	public Book() {
		super();
		this.tiltle = "";
		this.author = "";
		this.numberOfPages = 0;
		this.isbn = "";
		this.price = 0;
		
	}

	public Book(String title, String author, int numberOfPages, String isbn, double price) {
		this();
		this.tiltle = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.isbn = isbn;
		this.price = price;
		
	}

	@Override
	public String toString() {
		return "Book [tiltle=" + tiltle + ", author=" + author + ", numberOfPages=" + numberOfPages + ", isbn=" + isbn
				+ ", price=" + price + "]";
	}

	public String getTiltle() {
		return tiltle;
	}

	public void setTiltle(String tiltle) {
		this.tiltle = tiltle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	
	
}
