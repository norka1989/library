package Library;


import Library.DAO.BookListDataBase;
import Library.Entity.Book;
import Library.Entity.Genre;
import Library.Service.BookComparatorByAuthor;
import Library.Service.BookComparatorByGenre;
import Library.Service.BookComparatorByName;
import Library.Service.BookComparatorByPrice;

import java.util.*;

/**
 * public class that contains list of methods containing information that display in console
 */
public class ViewService {
    static Scanner scanner = new Scanner(System.in);

    public static int beginProject() {
        System.out.println("Запущено приложение Библиотека");
        System.out.println("Выбирите из списка:\n" +
                "1. Отображение списка доступных книг\n" +
                "2. Выход\n");

        System.out.println("Сделайте выбор - ");
        int x = scanner.nextInt();
        if (x < 1 && x > 2) System.out.println("Введите корректное число");
        return x;
    }

    public static int display(int x) {
        if (x == 1) {
            System.out.println("Выбирите из списка:\n" +
                    "1. Вывести полный список книг\n" +
                    "2. Применить фильтр по выбранному полю\n" +
                    "3. Отсортировать по выбранному полю\n" +
                    "4. Выход");
        } else if (x == 2) {
            System.out.println("Выход из приложения");
        }
        System.out.println("\nСделайте выбор - ");
        int y = scanner.nextInt();
        return y;
    }

    public static void userChoise(int x) {
        if (x == 1) showBookList(BookListDataBase.bookList);
        else if (x == 2 || x == 3) {
            listOfFields();
        } else System.out.println("Выход");
    }

    /*public static void nextStep2(int x){
        if(display(x)==2) {    //будет лишний вызов метода
            System.out.println("Применяем фильтр по полю ");

        } else if(display(x)==3){
            System.out.println("Сортируем список по полю ");
            sortByFields(x);
        }
    } */
    public static int listOfFields() {
        System.out.println("Выбирите поле:\n\n" +
                "1.Название книги\n" +
                "2.Автор\n" +
                "3.Жанр\n" +
                "4.Стоимость");
        int nameOfChoise = scanner.nextInt();
        return nameOfChoise;
    }

    /*public static void filterByFields(int field){
        if (field==1)   ;
        else if (field==2)    ;
        else if (field==3) {
        filterGenre(BookListDataBase.bookList,) //todo дописать код по считыванию жанра
        }
        else if(field==4) ;
    }*/
    public static void listOfGenres() {
        Collections.sort(BookListDataBase.bookList, new BookComparatorByGenre());
        int prevIndex = 0;
        int nextIndex;
        System.out.println(BookListDataBase.bookList.get(prevIndex).getGenre());
        for (int i = 1; i < BookListDataBase.bookList.size(); i++) {
            nextIndex = i;
            Genre prevGenre = BookListDataBase.bookList.get(prevIndex).getGenre();
            Genre nextGenre = BookListDataBase.bookList.get(nextIndex).getGenre();
            if (prevGenre != nextGenre) {
                System.out.println(nextGenre);
            }
            prevIndex = nextIndex;
        }
    }

    public static List<Genre> listOfGenresSimple() {
        Collections.sort(BookListDataBase.bookList, new BookComparatorByGenre());
        List<Genre> genres = new ArrayList<>();
        for (Book b : BookListDataBase.bookList) {
            if (!genres.contains(b.getGenre())) {
                genres.add(b.getGenre());
            }
        }
        return genres;
    }

    public static Set<Genre> listOfGenresSimpleSet() {
        Collections.sort(BookListDataBase.bookList, new BookComparatorByGenre());
        Set<Genre> genres = new HashSet<>();
        for (Book b : BookListDataBase.bookList) {
            genres.add(b.getGenre());
        }
        return genres;
    }


    public static void sortByFields(int field) {
        if (field == 1) Collections.sort(BookListDataBase.bookList, new BookComparatorByName());
        else if (field == 2) Collections.sort(BookListDataBase.bookList, new BookComparatorByAuthor());
        else if (field == 3) Collections.sort(BookListDataBase.bookList, new BookComparatorByGenre());
        else if (field == 4) Collections.sort(BookListDataBase.bookList, new BookComparatorByPrice());
    }

    public static void showBookList(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    public static void filterGenre(List<Book> bookList, Genre genre) {
        for (Book books : bookList) {
            if (books.getGenre() == genre)
                System.out.println(books.toString());
        }
    }
}
