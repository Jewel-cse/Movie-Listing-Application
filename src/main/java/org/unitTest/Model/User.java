package org.unitTest.Model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<Movie> favorites;

    public List<Movie> getFavorites() {
        return favorites;
    }

    public void addFavorites(Movie movie) {
        favorites.add(movie);;
    }

    public void removeFavorite(Movie movie) {
        favorites.remove(movie);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User(String userName) {
        this.userName = userName;
        this.favorites = new ArrayList<>();
    }


    @Override
    public String toString() {
        if(favorites != null)
        {
            return "User{" +
                    "userName='" + userName + '\'' +
                    "favorite movies = '" + favorites + '\'' +
                    '}';
        }
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }


}
