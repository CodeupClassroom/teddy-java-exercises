package movies;

/**
 * - private properties
 * - a constructor that sets those properties
 * - getters and setters
 */
public class Movie {
    private String title;
    private String genre;
    private int rating;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
            "title='" + title + '\'' +
            ", genre='" + genre + '\'' +
            ", rating=" + rating +
            '}';
    }
}