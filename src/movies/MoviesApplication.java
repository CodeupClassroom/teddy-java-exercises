package movies;

import util.Input;

import java.util.Arrays;

/**
 * 1. Show all the movies
 * 2. Extract a method
 * 3. Change our method to handle categories (overload)
 * 4. De-duplicate
 *
 * 5. Deal with user input
 */
public class MoviesApplication {
    // Static Properties
    public static Input input = new Input();
    public static Movie[] movies = MoviesArray.findAll();

    public static void showMovie(Movie movie) {
        System.out.println(movie);
    }

    public static void showMovies() {
        for(Movie movie : movies) {
            showMovie(movie);
        }
    }

    public static void showMovies(String category) {
        for(Movie movie : movies) {
            if (! movie.getGenre().equals(category)) {
                continue;
            }
            showMovie(movie);
        }
    }

    public static void showMenu() {
        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view musicals");
            System.out.println("3 - add a movie");

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
                case 3:
                    addMovie();
                    break;
                default:
                    System.out.println("ERROR: we should never get here.");
                    break;
            }
        } while(true);
    }

    private static void addMovie() {
        // 1. get some input from the user (title + genre)
        System.out.print("Enter the title: ");
        String title = input.getString();
        System.out.print("Enter the genre: ");
        String genre = input.getString();

        // 2. Create a movie object based on the user input
        Movie newMovie = new Movie(title, genre);

        // 3. "Add" that movie to the movies array

        // 3a. Create a copy of the array with a longer length
        Movie[] moviesPlus = Arrays.copyOf(movies, movies.length + 1);

        // 3b. Add the new movie to the copy (set the item at the last index to our new movie)
        int lastIndex = moviesPlus.length - 1;
        moviesPlus[lastIndex] = newMovie;

        // 3c. re-assign the movies property to our new array
        movies = moviesPlus;
    }

    public static void main(String[] args) {
        showMenu();

        int[] myIntegers = new int[123];
//        int myIntegers[] = new int[123];

    }


    ////////////////// Instance Properties


}
