package org.example.oop;

/**
 * @author christopherochiengotieno@gmail.com
 * @version 1.0.0
 * @since Friday, 14/10/2022
 */
public class OOP {
    public static void main(String[] args) {
        /*
         * Inheritance
         *
         * Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another.
         * With the use of inheritance the information is made manageable in a hierarchical order.
         * */

        Student student = new Student("chris");
        System.out.println(student.name);


        /*
         * Overriding
         *
         * In the previous chapter, we talked about superclasses and subclasses.
         * If a class inherits a method from its superclass, then there is a chance to override the method provided that it is not marked final.
         * */
        String name = student.getName();
        System.out.println(name);

        /*
         * Polymorphism
         *
         * Polymorphism is the ability of an object to take on many forms.
         * The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
         * */
        Person person = new Student("Chris");
        System.out.println(person.getName());

        person = new Lecturer("Chris");
        System.out.println(person.getName());

        /*
         * Abstraction
         *
         * In Object-oriented programming, abstraction is a process of hiding the implementation details from the user, only the functionality will be provided to the user.
         * In other words, the user will have the information on what the object does instead of how it does it.
         * In Java, abstraction is achieved using Abstract classes and interfaces.
         *
         * Rules for using abstract class:
         *
         * 1. Abstract classes may or may not contain abstract methods, i.e., methods without body ( public void get(); )
         * 2. But, if a class has at least one abstract method, then the class must be declared abstract.
         * 3. If a class is declared abstract, it cannot be instantiated.
         * 4. To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.
         * 5. If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.
         * */

        abstract class Person {
            // attributes
            // methods
            // declare a method as abstract if you want the implementation to be in the child class
        }

        class Lecturer extends Person {
            // access to person attributes and methods
        }

        /*
         * Encapsulation
         *
         * Encapsulation is one of the four fundamental OOP concepts. The other three are inheritance, polymorphism, and abstraction.
         * Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit
         *
         * */

         /*
         * interfaces
         *
         *  It is a collection of abstract methods.
         *  Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types.
         *  Method bodies exist only for default methods and static methods.
         *
         *  example: public interface NameOfInterface {// Any number of final, static fields // Any number of abstract method declarations\}
         * */

        // packages
    }
}
