package Library.Entity;

/**
 * public list of constants that describes genres of books from library
 */
public enum Genre {
    NOVEL("novel"),
    FAIRY_TALES("fairyTales"),
    ART("art"),
    DETECTIVE("detective"),
    HISTORICAL("historical");

    private String name;

    Genre(String name){
        this.name=name;
    }
}
