package Library;

import Library.DAO.BookListDataBase;
import Library.Service.BookComparatorByGenre;

import java.util.Collections;

/**
 * public class for start project
 */
public class StartUp {
    public static void main(String[] args) {
        BookListDataBase.loadBookList();
        /*int userChoice;
        do {
           userChoice= ViewService.beginProject();
        } while(userChoice<1 && userChoice>2);
        int y=ViewService.display(userChoice);
        ViewService.userChoise(y);*/
        System.out.println("ViewService.listOfGenresSimple() = " + ViewService.listOfGenresSimple());
        System.out.println("ViewService.listOfGenresSimpleSet() = " + ViewService.listOfGenresSimpleSet());
        //ViewService.listOfGenres();



    }


}
