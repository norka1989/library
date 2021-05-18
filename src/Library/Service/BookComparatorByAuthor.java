package Library.Service;

import Library.Entity.Book;

import java.util.Comparator;

/**
 * public class that contains method for compare books by author
 */

public class BookComparatorByAuthor implements Comparator <Book> {
    @Override
    public int compare(Book b1,Book b2){
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}
