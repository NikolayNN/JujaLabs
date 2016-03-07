package lab25;

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
class Journal extends Issue {
    private String yearJournal;
    private String numberJournal;

    public Journal(String name, int countPages, String yearJournal, String numberJournal) {
        super(name, countPages);
        this.yearJournal = yearJournal;
        this.numberJournal = numberJournal;
        }
    public String toPrint() {
        return  "Journal{name=" + name +",countPages=" + countPages + ",year=" + yearJournal +",number=" + numberJournal + "}";
    }
    /*BODY*/
}