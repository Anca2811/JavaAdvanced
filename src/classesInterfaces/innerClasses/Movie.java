package classesInterfaces.innerClasses;
/*create the Movie  class which will cover fields: title, director, year of release,
genre, distributor. This class should contain a default constructor and getter
and setter  methods. Please consider creating toString  method which will be
responsible for returning info about a specific object.*/

public class Movie {
    private String title;
    private String director;
    private int yearOfRelease;
    private String genre;
    private String distributor;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", genre='" + genre + '\'' +
                ", distributor='" + distributor + '\'' +
                '}';
    }

    /*Create the static nested MovieCreateor  class. It should contain:
class elds similar to Movie  class
methods which will be responsible for setting movie values. Each method
should return an object instance of the object for which the method is being
called
the createMovie  method will create the instance of the Movie  class. It will
return it as a method results*/

    static class MovieBuilder {
        private String title;
        private String director;
        private int yearOfRelease;
        private String genre;
        private String distributor;

        public MovieBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieBuilder setDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieBuilder setYearOfRelease(int yearOfRelease) {
            this.yearOfRelease = yearOfRelease;
            return this;
        }

        public MovieBuilder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public MovieBuilder setDistributor(String distributor) {
            this.distributor = distributor;
            return this;
        }

        public Movie build() {
            Movie movie = new Movie();
            movie.setTitle(this.title);
            movie.setDirector(this.director);
            movie.setDistributor(this.distributor);
            movie.setGenre(this.genre);
            movie.setYearOfRelease(this.yearOfRelease);
            return movie;

        }
    }
}