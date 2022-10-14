package org.example.loops;

/**
 * @author christopherochiengotieno@gmail.com
 * @version 1.0.0
 * @since Friday, 14/10/2022
 */
public class Loops {

    public static void main(String[] args) {
        /*
         * while loop
         *
         * Repeats a statement or group of statements while a given condition is true. It tests the condition before executing the loop body.
         * */
        int count = 0;
        while (count < 10) {
            ++count;
            System.out.println(count);
        }

        System.out.println("*********** do while *************");
        count = 0; // reset count
        do {
            ++count;
            System.out.println(count); // executes yet count is zero
        } while (count < 10 && count > 0);

        /*
         * for loop
         *
         * Execute a sequence of statements multiple times and abbreviates the code that manages the loop variable.
         * */
        System.out.println("*********** for loop *************");
        for (int i = 0; i < 10; ++i){
            System.out.println(i);
        }

        /*
         * for loop
         *
         * Execute a sequence of statements multiple times
         * */
        System.out.println("*********** for each *************");
        int[] numbers = new int[]{1,2,3,4,5};
        for (int number: numbers
             ) {
            System.out.println(number);
        }

    }


}
