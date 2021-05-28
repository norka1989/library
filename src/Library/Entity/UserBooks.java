package Library.Entity;

import java.util.ArrayList;
import java.util.List;

public class UserBooks {
    public static List<Book> userBookList=new ArrayList<Book>();
    public static void addBookInUserBookList(Book book){
        userBookList.add(book);
    }
    public static void showUserBookList(){
        System.out.println("Взята(ы) из библиотеки следующая(ие) книга(и)");
        for(Book book:userBookList){
            System.out.println(book.toString());
        }
    }
    public static void removeBookFromUserBookList(Book book){
        userBookList.remove(book);
    }
}
