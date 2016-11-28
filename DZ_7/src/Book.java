/**
 * Created by bereznoy on 28.11.2016.
 */
public class Book {
    String name;
    BookType bookType;
    String author;
    int year;

    public Book(String name, BookType bookType, String author, int year) {
        this.name = name;
        this.bookType = bookType;
        this.author = author;
        this.year = year;
    }
    public enum BookType{
        NOVEL,
        STORY,
        COMEDY,
        DRAMA,
        SCIENCE,
        DETECTIVE;
    }
}
