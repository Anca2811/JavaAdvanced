package classesInterfaces.innerClasses;

public class Main {
    public static void main(String[] args) {
        Outer.NestedStatic nestedStatic = new Outer.NestedStatic();

        nestedStatic.printNestedStatic();

        System.out.println("Creating new static object");
        Outer outerObject = new Outer(10);

        Outer.Nested nested = outerObject.new Nested();
        nested.printNested();

        Movie movie = new Movie.MovieBuilder()
                .setTitle("Avatar")
                .setDirector("Steven Spilebrg")
                .setGenre("drama")
                .setDistributor("AAA")
                .setYearOfRelease(2023)
                .build();

        Movie movie1 = new Movie.MovieBuilder()
                .setTitle("Avatar1")
                .setDirector("Steven Spilebrg1")
                .setGenre("drama1")
                .setDistributor("AAA1")
                .setYearOfRelease(20233)
                .build();

        System.out.println(movie);
        System.out.println(movie1);

        Book book = new Book("abc", 10);
        System.out.println(book.getTitle().length());

        Book book2 = new Book().setNrOfPages(10).setTitle("Aloha");

    }
}
