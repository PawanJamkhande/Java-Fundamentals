package ComparableNComparator.Comparator;


import java.util.ArrayList;
import java.util.Collections;

public class BookApp {

	public static void main(String[] args) {
		ArrayList<Book>book=new ArrayList<Book>();

		book.add(new Book(5,"C",200,4.5));
		book.add(new Book(2,"C++",200,3.5));
		book.add(new Book(1,"Java",300,5.5));
		book.add(new Book(4,"Scala",500,2.5));
		System.out.println("Before Sorting");
		for(Book b:book) {
			System.out.println(b);
		}
		Collections.sort(book);
		System.out.println("After Sorting");
		for(Book b:book) {
			System.out.println(b);
		}
		System.out.println("Book ratings Before Sorting");
		for(Book b:book) {
			System.out.println(b);
		}
		Collections.sort(book,new SortBookByRating());
		System.out.println("Book rating After Sorting");
		for(Book b:book) {
			System.out.println(b);
		}
	}

}