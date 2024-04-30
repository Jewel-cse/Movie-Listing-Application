package org.unitTest.Service;

import org.unitTest.Model.Movie;

import java.util.ArrayList;
import java.util.List;

import static org.unitTest.Service.MenuService.getStringInput;
import static org.unitTest.Service.UserService.currentUser;

public class MovieService {

    public static List<Movie> allMovies = new ArrayList<>();
    public static Integer totalMovies  = allMovies.size();

    public static void searchMovies() {
        String searchTerm = getStringInput("Enter search term (title, cast, or category): ");
        List<Movie> results = new ArrayList<>();
        if(searchTerm == null){
            displayMovie(allMovies);
        }else{
            for (Movie movie : allMovies) {
                if (isMatch(movie, searchTerm)) {
                    results.add(movie);
                }
            }
            displayMovie(results);
        }
    }

    public static void seeDetails(){
        String title = getStringInput("Enter movie title which you want to add favorite ");
        Movie movie = allMovies.stream().filter(movie1 -> movie1.getTitle().toLowerCase().contains(title.toLowerCase())).findAny().orElse(null);
        if(movie != null){
            System.out.print(String.format("Title : %s \nCategory : %s \nCast : %s \nReleased : %s \nBudget : %s",
                    movie.getTitle(), movie.getCategory(), movie.getCast(), movie.getReleaseDate(), movie.getBudget()));
        }else {
            System.out.println("Not exist with titled :"+title);
        }
    }

    public static void addToFavorite()  {
        String title = getStringInput("Enter movie title which you want to add favorite ");
        Movie movie = allMovies.stream().filter(movie1 -> movie1.getTitle().toLowerCase().contains(title.toLowerCase())).findAny().orElse(null);
        if(movie != null){
            currentUser.addFavorites(movie);
            System.out.println("Successfully add to favorite");
        }else{
            System.out.println("Failed to add in favorite ");
        }
    }

    public static void displayMovie(List<Movie> results){

        if (results.isEmpty()) {
            System.out.println("No movies found!");
            return;
        }
        System.out.println("\nSearch Results:");
        results.sort((m1, m2) -> m1.getTitle().compareToIgnoreCase(m2.getTitle()));  //sort movie by title
        for (Movie movie : results) {
            System.out.println(movie);
        }
    }

    private static boolean isMatch(Movie movie, String searchTerm) {
        return movie.getTitle().toLowerCase().contains(searchTerm.toLowerCase()) ||
                movie.getCast().stream().anyMatch(cast -> cast.toLowerCase().contains(searchTerm.toLowerCase())) ||
                movie.getCategory().toLowerCase().contains(searchTerm.toLowerCase());
    }

}
