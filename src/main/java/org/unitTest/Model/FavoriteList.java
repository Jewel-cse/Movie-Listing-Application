package org.unitTest.Model;

import java.util.ArrayList;
import java.util.List;

public class FavoriteList {
    private  List<Movie> movies ;

    public FavoriteList() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    @Override
    public String toString() {
        return "FavoriteList{" +
                "movies=" + movies +
                '}';
    }
}
