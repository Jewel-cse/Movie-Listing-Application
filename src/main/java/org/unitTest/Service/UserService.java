package org.unitTest.Service;

import org.unitTest.Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    protected static User currentUser;
    public static List<User> userList = new ArrayList<>() ;


    // Stage 1: User Registration
    public static void registerUser() {
        System.out.println("Enter your mail ");
        String email = new Scanner(System.in).nextLine();
        currentUser = new User(email);
        userList.add(currentUser);
        System.out.println("Registration successful!");
    }
    public static void seeUser(){
        if(currentUser != null){
            System.out.println(currentUser);
            //System.out.println(currentUser.getFavorites());
        }
        else{
            System.out.println("No user signed in now");
        }
    }
}
