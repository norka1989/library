package Library.Service;

import Library.Entity.Book;

import java.util.Comparator;

/**
 * public class that contains method to compare books by price
 */
public class BookComparatorByPrice implements Comparator<Book> {

    @Override
    public int compare(Book b1,Book b2){
    if (b1.getPrice()>b2.getPrice()) return 1;
    else if (b1.getPrice()<b2.getPrice()) return -1;
    else return 0;
    }
}
