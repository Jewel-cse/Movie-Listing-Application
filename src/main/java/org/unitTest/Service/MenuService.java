package org.unitTest.Service;

import java.util.Scanner;

public class MenuService {
    public static int displayMenu() {
        System.out.println("\nMovie App");
        System.out.println("1. Register User");
        System.out.println("2. See User Details and favorite");
        System.out.println("3. Search Movies");
        System.out.println("4. See Details ");
        System.out.println("5. Add to Favorite");
        System.out.println("6. Remove from Favorite");
        System.out.println("7. Search only  Favorite movies");

        System.out.println("9. Exit");

        return getIntInput("Choose the menu number : ");
    }
    public static String getStringInput(String prompt) {
        System.out.print(prompt);
        return new Scanner(System.in).nextLine();
    }

    public static int getIntInput(String promt) {
        System.out.print(promt);
        while (true) {
            try {
                return Integer.parseInt(new Scanner(System.in).nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}
