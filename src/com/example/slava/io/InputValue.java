package com.example.slava.io;

import java.util.Scanner;

public class InputValue {
    private final String ENTER_AGE = "Enter an %s's age: ";
    private final String ENTER_NAME = "Enter name: ";
    private final String ENTER_PSEUDONYM = "Enter Pseudonym: ";

    private Scanner scanner;

    public InputValue() {
        scanner = new Scanner(System.in);
    }

    public String getName(){
        System.out.print(ENTER_NAME);
        return scanner.nextLine();
    }

    public String getPseudonym(){
        System.out.print(ENTER_PSEUDONYM);
        return scanner.nextLine();
    }

    public int getInt(String name) {
        int age = -1;
        while (age < 0) {
            System.out.printf(ENTER_AGE, name);
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
            } else {
                scanner.nextLine();
            }
        }
        return age;
    }
}
