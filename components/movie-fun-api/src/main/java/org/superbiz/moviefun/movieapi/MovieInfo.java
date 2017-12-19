package org.superbiz.moviefun.movieapi;


public class MovieInf {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String director;
    private String title;
    private int year;
    private String genre;
    private int rating;

    public MovieInfo() {
    }

    public MovieInfo(String title, String director, String genre, int rating, int year) {
        this.director = director;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }

    public MovieInfo(String director, String title, int year) {
        this.director = director;
        this.title = title;
        this.year = year;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof MovieInf)) return false;
        if (!super.equals(object)) return false;

        MovieInf movieInf = (MovieInf) object;

        if (getId() != movieInf.getId()) return false;
        if (getYear() != movieInf.getYear()) return false;
        if (getRating() != movieInf.getRating()) return false;
        if (getDirector() != null ? !getDirector().equals(movieInf.getDirector()) : movieInf.getDirector() != null)
            return false;
        if (getTitle() != null ? !getTitle().equals(movieInf.getTitle()) : movieInf.getTitle() != null) return false;
        if (getGenre() != null ? !getGenre().equals(movieInf.getGenre()) : movieInf.getGenre() != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getDirector() != null ? getDirector().hashCode() : 0);
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + getYear();
        result = 31 * result + (getGenre() != null ? getGenre().hashCode() : 0);
        result = 31 * result + getRating();
        return result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

