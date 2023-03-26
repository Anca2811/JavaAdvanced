package classesInterfaces.innerClasses;
public class Book {

    private String title;

    private int nrOfPages;

    public Book() {

    }

    public Book(String title, int nrOfPages) {
        this.title = title;
        this.nrOfPages = nrOfPages;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public Book setNrOfPages(int nrOfPages) {
        this.nrOfPages = nrOfPages;
        return this;
    }

    public String getTitle() {
        return title;
    }
}