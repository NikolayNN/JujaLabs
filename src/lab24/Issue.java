package lab24;

/**
 * Created by Nikol on 2/29/2016.
 */
public class Issue {
    protected String name;
    protected int countPages;
    public Issue(String name, int countPages) {
        this.name = name;
        this.countPages = countPages;
    }
    public String toPrint() {
        return "name=" + name +
                ",countPages=" + countPages;
    }
}
class Book extends Issue {
    private String authorBook;
    public Book(String name, int countPages, String authorBook) {
        super(name, countPages);
        this.authorBook = authorBook;
    }
    public String toPrint() {
        return "Book{name=" + name +
                ",countPages=" + countPages +",author="+authorBook+"}";
    }
}