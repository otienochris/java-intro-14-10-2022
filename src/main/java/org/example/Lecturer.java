package org.example;

/**
 * @author christopherochiengotieno@gmail.com
 * @version 1.0.0
 * @since Friday, 14/10/2022
 */
public class Lecturer extends Person {
    public Lecturer(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Lecturer: " + super.getName();
    }
}
