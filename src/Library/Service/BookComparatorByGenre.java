package Library.Service;

import Library.Entity.Book;

import java.util.Comparator;

/**
 * The main purpose of this class is to compare 2 books by genre field
 */

public class BookComparatorByGenre implements Comparator<Book> {
    @Override
    public int compare (Book b1,Book b2){
        return b1.getGenre().compareTo(b2.getGenre());
    }
}
