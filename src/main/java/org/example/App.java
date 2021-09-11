/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program prompts for an input string and displays
// output that shows the input string and the number of characters
// the string contains.

package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // prompt the user to input a string
        System.out.print("What is the input string? ");

        // scan the string and store it a string variable called input
        String input = scanner.next();

        // use a built-in function to determine the length of the string
        // output to the screen as described by the assignment
        System.out.print(input + " has " + input.length() + " characters.");

    }

}
