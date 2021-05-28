package Library;

import Library.DAO.BookListDataBase;
import Library.Entity.Book;
import Library.Entity.UserBooks;
import Library.Service.BookComparatorByGenre;

import java.util.Collections;

/**
 * public class for start project
 */
public class StartUp {
    public static void main(String[] args) {
        BookListDataBase.loadBookList();
        int firstUserChoice;
        do {
            firstUserChoice= ViewService.beginProject();
        } while(firstUserChoice<1 && firstUserChoice>2);
        int y=ViewService.display(firstUserChoice);
        ViewService.userChoise(y);
        if(y==1) {
            String nameOfBook=ViewService.obrabotkaAWishToTakeBook();
            for(Book book:BookListDataBase.bookList){
                if(nameOfBook.equalsIgnoreCase(book.getBookName()))
                    UserBooks.addBookInUserBookList(book);
            }
            System.out.println("Список книг, взятых пользователем");
            UserBooks.showUserBookList();
        }






    }


}
