package Library;


import Library.DAO.BookListDataBase;
import Library.Entity.Book;
import Library.Entity.Genre;
import Library.Service.BookComparatorByAuthor;
import Library.Service.BookComparatorByGenre;
import Library.Service.BookComparatorByName;
import Library.Service.BookComparatorByPrice;
import org.w3c.dom.ls.LSOutput;


import java.util.*;

/**
 * public class that contains list of methods containing information that display in console
 */
public class ViewService {
    static Scanner scanner = new Scanner(System.in);

    public static int beginProject() {
        System.out.println("The Library app is running");
        System.out.println("Select from the list:\n" +
                "1. Displaying a list of available books\n" +
                "2. Exit\n");

        System.out.println("Make a choice - ");
        int x = scanner.nextInt();
        if (x < 1 && x > 2) System.out.println("Enter the correct number");
        return x;
    }

    public static int display(int x) {
        if (x == 1) {
            System.out.println("Select from the list:\n" +
                    "1. Display the full list of books\n" +
                    "2. Apply a filter on the selected field\n" +
                    "3. Sort by selected field\n" +
                    "4. Exit");
        } else if (x == 2) {
            System.out.println("Exit the app");
        }
        System.out.println("\nMake a choice - ");
        int y = scanner.nextInt();
        return y;
    }

    public static void userChoise(int x) {
        if (x == 1) {
            showBookList(BookListDataBase.bookList);

        }
        else if (x == 2 || x == 3) {
            listOfFields();
        } else System.out.println("Exit");
    }
    public static int aWishToTakeBook(){
        System.out.println("Want to take home a book from the library?"+
                            "\n"+"If you want, enter - 1,if not, enter-0");
        int y=scanner.nextInt();
        return y;
    }
    public static String obrabotkaAWishToTakeBook(){
        String nameOfBook=null;
        if(aWishToTakeBook()==1){
            System.out.println("Enter the name of the book you want to borrow");
            nameOfBook=scanner.next();
        } else {
            System.out.println("Would you like to exit the Library app?");
        }
        return nameOfBook;
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
        System.out.println("Select a field:\n\n" +
                "1.Name of Book\n" +
                "2.Author\n" +
                "3.Genre\n" +
                "4.Price");
        int nameOfChoise = scanner.nextInt();
        return nameOfChoise;
    }

    public static void filterByFields(int field){
        if (field==1||field==2||field==4) System.out.println("The filter is available only by genre");
        else if (field==3) {
            System.out.println("Choose from the available genres");
            listOfGenres();
            Genre selectedGenre=selectedGenre();
            filterGenre(BookListDataBase.bookList,selectedGenre);
        }

    }


   public static Genre selectedGenre(){
        Genre genre = null;
       System.out.println("Press number");
       int numberOfGenre=scanner.nextInt();
        switch (numberOfGenre){
            case 1:
            genre=Genre.NOVEL;
            break;
            case 2:
            genre=Genre.FAIRY_TALES;
            break;
            case 3:
            genre=Genre.ART;
            break;
            case 4:
            genre=Genre.DETECTIVE;
            break;
            case 5:
            genre=Genre.HISTORICAL;
            break;
             }
        return genre;
    }
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
