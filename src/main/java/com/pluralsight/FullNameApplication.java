package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        //ask the user for their name
        System.out.print("First Name");
        String firstName = scanner.nextLine().trim();

        //ask the user for their middle name
        System.out.print("Middle Name");
        String middleName = scanner.nextLine().trim();

        //ask the user for their last name
        System.out.print("Last Name");
        String lastName = scanner.nextLine().trim();

        //ask the user for their suffix
        System.out.print("Suffix");
        String suffix = scanner.nextLine().trim();


        String fullName = firstName;

        if(middleName.length() > 0) {
            fullName += " " + middleName;
        }

        fullName += " " + lastName;

        if(suffix.length() > 0) {
            fullName += " " + suffix;
        }

        //sout the result
        System.out.println(fullName);

    }
}
