package org.unitTest;

import static org.unitTest.Service.MenuService.displayMenu;
import static org.unitTest.Service.UserService.registerUser;
import static org.unitTest.Service.UserService.seeUser;

public class Main {

    public static void main(String[] args) {
        // Main program loop for user interaction
        while (true) {
            int choice = displayMenu();
            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    seeUser();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}


