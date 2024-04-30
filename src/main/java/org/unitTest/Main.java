package org.unitTest;

import org.unitTest.Utility.UtilityService;

import static org.unitTest.Service.MenuService.displayMenu;
import static org.unitTest.Service.MovieService.seeAllMovieList;
import static org.unitTest.Service.UserService.registerUser;
import static org.unitTest.Service.UserService.seeUser;

public class Main {

    public static void main(String[] args) {


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
                    seeAllMovieList();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}


