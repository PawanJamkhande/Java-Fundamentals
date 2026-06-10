package ComparableNComparator.Comparator;


public class Book implements Comparable<Book>  {

	private int bookId;
	private String bookName;
	private int  prise;
	private double bookRating;
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", prise=" + prise + ", bookRating=" + bookRating
				+ "]";
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrise() {
		return prise;
	}
	public void setPrise(int prise) {
		this.prise = prise;
	}
	public double getBookRating() {
		return bookRating;
	}
	public void setBookRating(double bookRating) {
		this.bookRating = bookRating;
	}
	public Book(int bookId, String bookName, int prise, double bookRating) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.prise = prise;
		this.bookRating = bookRating;
	}
	@Override
	public int compareTo(Book b1) {
		
		return this.bookId-b1.bookId;
	}
	
}
