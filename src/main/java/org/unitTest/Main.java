package org.unitTest;

import org.unitTest.Utility.UtilityService;

import static org.unitTest.Service.MenuService.displayMenu;
import static org.unitTest.Service.MovieService.*;
import static org.unitTest.Service.UserService.registerUser;
import static org.unitTest.Service.UserService.seeUser;

public class Main {

    public static void main(String[] args) {
        UtilityService.loadMoviesFromCSV("src/main/resources/Movies.csv");

        while (true) {
            int choice = displayMenu();

            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    seeUser();
                    break;
                case 3:
                    searchMovies();
                    break;
                case 4:
                    seeDetails();
                    break;
                case 5:
                    addToFavorite();
                    break;
                case 6:
                    removeFromFavorite();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }


}

//See details for any movie like movie title, cast, category, release date, budget.


