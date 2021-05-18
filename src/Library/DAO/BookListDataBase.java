package Library.DAO;

import Library.Entity.Book;
import Library.Entity.Genre;

import java.util.ArrayList;
import java.util.List;

/**
 * public class that contains list of books in library
 */

public class BookListDataBase {
    public static List<Book> bookList = new ArrayList<Book>();

    public static void loadBookList() {
        Book book_1 = new Book("Goldiloks and 3 bears", "folk", Genre.FAIRY_TALES, 12);
        Book book_2 = new Book("Volf and 3 piglets", "folk", Genre.FAIRY_TALES, 10);
        Book book_3 = new Book("Thumbelina", "Andersen", Genre.FAIRY_TALES, 15);
        Book book_4 = new Book("Master and Margarita", "Bulgakov", Genre.ART, 20);
        Book book_5 = new Book("Eugene Onegin", "Pushkin", Genre.ART, 9);
        Book book_6 = new Book("Harry Potter", "Rowling", Genre.ART, 25);
        Book book_7 = new Book("The Picture of Dorian Grey", "Wilde", Genre.ART, 17);
        Book book_8 = new Book("Sherlock Holmes", "Conan Doyle", Genre.DETECTIVE, 9);
        Book book_9 = new Book("Wuthering Heights", "Brontë", Genre.NOVEL, 12);
        Book book_10 = new Book("The Great Gatsby", "Fitzgerald", Genre.NOVEL, 15);
        Book book_11 = new Book("Headless horseman", "Rid", Genre.NOVEL, 16);
        Book book_12 = new Book("Visit to Bonaparte", "Barkov", Genre.HISTORICAL, 5);

        bookList.add(book_1);
        bookList.add(book_2);
        bookList.add(book_3);
        bookList.add(book_4);
        bookList.add(book_5);
        bookList.add(book_6);
        bookList.add(book_7);
        bookList.add(book_8);
        bookList.add(book_9);
        bookList.add(book_10);
        bookList.add(book_11);
        bookList.add(book_12);
    }
}