package Library.Entity;

public class Book {
    private String bookName;
    private String author;
    private Genre genre;
    private int price;

    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public Genre getGenre(){
        return genre;
    }
    public void setGenre(Genre genre){
        this.genre=genre;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }

    public Book(String bookName, String author, Genre genre, int price){
        this.bookName=bookName;
        this.author=author;
        this.genre=genre;
        this.price=price;
    }

    @Override
    public String toString (){
        return "Library.View.Book { "+
                "bookName - "+ bookName+", "+
                "author - "+ author+", "+
                "genre - "+ genre+", "+
                "price - "+ price+ " }";
    }

}


