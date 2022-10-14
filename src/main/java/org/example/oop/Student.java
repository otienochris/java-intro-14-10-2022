package org.example.oop;

import org.example.oop.Person;

/**
 * @author christopherochiengotieno@gmail.com
 * @version 1.0.0
 * @since Friday, 14/10/2022
 */
public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Student: " + super.getName();
    }
}
