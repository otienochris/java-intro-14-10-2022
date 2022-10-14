package org.example.conditions;

/**
 * @author christopherochiengotieno@gmail.com
 * @version 1.0.0
 * @since Friday, 14/10/2022
 */
public class Conditions {
    public static void main(String[] args) {
        /*
         * 	if statement
         * An if statement consists of a boolean expression followed by one or more statements.
         * */
        int age = 18;

        if (age >= 18) {
            System.out.println("You can buy Alcohol");
        }

        /*
         * if...else statement
         * An if statement can be followed by an optional else statement, which executes when the boolean expression is false.
         * */
        age = 16;
        if (age >= 18) {
            System.out.println("You can buy Alcohol");
        } else {
            System.out.println("Go back to school!");
        }

        /*
         * switch statement
         * A switch statement allows a variable to be tested for equality against a list of values.
         * */
        switch (age){
            case 4:
                System.out.println("Go back to school!");
                break;
            case 18:
                System.out.println("You can buy Alcohol");
                break;
            default:
                System.out.println("Who are you?");

        }

        /*
        * We have covered conditional operator ? : in the previous chapter which can be used to replace if...else statements.
        * It has the following general form −
        *
        * Exp1 ? Exp2 : Exp3;
        * */
        System.out.println(age >= 18 ? "You can buy Alcohol" : "Who are you?");
    }
}
