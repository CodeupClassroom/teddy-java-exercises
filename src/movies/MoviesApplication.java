package movies;

import util.Input;

/**
 * 1. Show all the movies
 * 2. Extract a method
 * 3. Change our method to handle categories (overload)
 * 4. De-duplicate
 *
 * 5. Deal with user input
 */
public class MoviesApplication {

    public static void showMovie(Movie movie) {
        System.out.printf(
            "Title: %s -- Category: %s\n",
            movie.getTitle(),
            movie.getCategory()
        );
    }

    public static void showMovies() {
        Movie[] movies = MoviesArray.findAll();

        for(Movie movie : movies) {
            showMovie(movie);
        }
    }

    public static void showMovies(String category) {
        Movie[] movies = MoviesArray.findAll();

        for(Movie movie : movies) {
            if (! movie.getCategory().equals(category)) {
                continue;
            }
            showMovie(movie);
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view musicals");

            Input input = new Input();
            int userChoice = input.getInt(1, 2, "Your choice? ");

            switch (userChoice) {
                case 0:
                    System.exit(0);
                case 1:
                    showMovies();
                    break;
                case 2:
                    showMovies("musical");
                    break;
                default:
                    System.out.println("ERROR: we should never get here.");
                    break;
            }
        } while(true);
    }
}
