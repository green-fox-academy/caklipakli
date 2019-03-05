import java.util.List;
import java.util.stream.Collectors;

public class Book {

    private static int nextId = 0;

    private int id;
    private String title;
    private String author;
    private Integer releaseYear;

    public Book(String title, String author, Integer releaseYear) {
        this.id = nextId++;
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public Integer getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }
}
