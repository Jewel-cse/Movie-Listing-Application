package org.unitTest;

import org.unitTest.Utility.UtilityService;

import static org.unitTest.Service.MenuService.displayMenu;
import static org.unitTest.Service.MovieService.searchMovies;
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
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}


