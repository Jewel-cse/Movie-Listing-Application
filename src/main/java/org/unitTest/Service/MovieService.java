package org.unitTest.Service;

import org.unitTest.Model.Movie;
import org.unitTest.Utility.UtilityService;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    public static List<Movie> allMovies = new ArrayList<>();
    public static void  seeAllMovieList(){
        UtilityService.loadMoviesFromCSV("src/main/resources/Movies.csv");
        System.out.println(allMovies);
    }
}
