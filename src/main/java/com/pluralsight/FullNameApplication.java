package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to the Name Generator");
        System.out.println("To begin, enter your first name: ");
        String firstName = myScanner.nextLine();
        System.out.println("Enter your middle name (if applicable): ");
        String middleName = myScanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = myScanner.nextLine();
        System.out.println("Enter a suffix (if applicable): ");
        String suffix = myScanner.nextLine();

        System.out.println("Your Full Name is: ");

        if (suffix.isBlank() && middleName.isBlank()) {
            System.out.println(firstName.trim() + " " + lastName.trim());
        } else if (suffix.isBlank()) {
            System.out.println(firstName.trim() + " " + middleName.trim() + " " + lastName.trim());


        } else {
            System.out.println(firstName.trim() + " " + middleName.trim() + " " + lastName.trim() + ", " + suffix.trim());


        }
    }
}
