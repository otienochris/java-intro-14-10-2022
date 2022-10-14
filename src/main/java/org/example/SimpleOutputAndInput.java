package org.example;

import java.util.Scanner;

/**
 * Here you will learn simple ways to display output to users and take input from users in Java.
 * <p>
 * reference: https://www.programiz.com/java-programming/basic-input-output
 *
 * @author christopherochiengotieno@gmail.com
 * @version 1.0.0
 * @since Friday, 14/10/2022
 */
public class SimpleOutputAndInput {

    public static void main(String[] args) {

        /*
         * output
         *
         * print() - It prints string inside the quotes.
         * println() - It prints string inside the quotes similar like print() method. Then the cursor moves to the beginning of the next line.
         * printf() - It provides string formatting (similar to printf in C/C++ programming).
         * */

        System.out.println("1. println ");
        System.out.println("2. println ");

        System.out.print("1. print ");
        System.out.print("2. print");

        // https://www.baeldung.com/java-printstream-printf
        // %[flags][width][.precision]conversion-character
        System.out.printf("Hello %s!%n", "World");

        /*
         * Input
         *
         * In order to use the object of Scanner, we need to import java.util.Scanner package.
         *
         * we can use nextLong(), nextFloat(), nextDouble(), and next() methods to get long, float, double, and string input respectively from the user
         * */


        Scanner input = new Scanner(System.in);

        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);

        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);

        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);
    }
}
