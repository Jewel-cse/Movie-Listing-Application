package org.unitTest.Service;

import java.util.Scanner;

public class MenuService {
    public static int displayMenu() {
        System.out.println("\nMovie App");
        System.out.println("1. Register User");
        System.out.println("2.See User");
        System.out.println("3. Exit");

        return getIntInput();
    }

    public static int getIntInput() {
        while (true) {
            try {
                System.out.print("Enter your choice number: ");
                return Integer.parseInt(new Scanner(System.in).nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}
