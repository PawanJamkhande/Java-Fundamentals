package ComparableNComparator.Comparator;


import java.util.Comparator;

public class SortBookByRating implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		return Double.compare(o1.getBookRating(), o2.getBookRating());
	}

}
