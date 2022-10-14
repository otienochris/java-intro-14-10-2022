package org.example;

/**
 * <p>
 * Modifiers are keywords that you add to those definitions to change their meanings.
 * Java language has a wide variety of modifiers
 * <p>
 * There are two kinds of modifiers
 * 1. Java Access Modifiers
 * 2. Non Access Modifiers
 * <p>
 * To use a modifier, you include its keyword in the definition of a class, method, or variable. The modifier precedes the rest of the statement
 * <p>
 *
 * @author christopherochiengotieno@gmail.com
 * @version 1.0.0
 * @since Friday, 14/10/2022
 */
public class Modifiers {

    public static void main(String[] args) {

        /*
         * Access Control Modifiers
         *
         * Java provides a number of access modifiers to set access levels for classes, variables, methods and constructors.
         * The four access levels are −
         *
         * 1. Visible to the package, the default. No modifiers are needed.
         * 2. Visible to the class only (private).
         * 3. Visible to the world (public).
         * 4. Visible to the package and all subclasses (protected).
         *
         *
         * * Non-Access Modifiers
         *
         * Java provides a number of non-access modifiers to achieve many other functionality.
         *
         * 1. The static modifier for creating class methods and variables.
         * 2. The final modifier for finalizing the implementations of classes, methods, and variables.
         * 3. The abstract modifier for creating abstract classes and methods.
         * 4. The synchronized and volatile modifiers, which are used for threads.
         * */

        SampleClassForModifiers sampleClassForModifiers = new SampleClassForModifiers();
        // we can set and access public variables
        sampleClassForModifiers.name = "dan";
        System.out.println(sampleClassForModifiers.name);

        // static fields should be accessed directly
        SampleClassForModifiers.year = 2002;
        System.out.println(SampleClassForModifiers.year);

        // private fields require setter and getters
        sampleClassForModifiers.setUsername("otienochris");
        String username = sampleClassForModifiers.getUsername();
        System.out.println(username);

    }
}
