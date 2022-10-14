package org.example.modifiers;

/**
 * @author christopherochiengotieno@gmail.com
 * @version 1.0.0
 * @since Friday, 14/10/2022
 */
public class SampleClassForModifiers {
    public String name = "Christopher";
    public static int year = 2001;
    private final String ID_NUMBER = "35879912";
    private String username;

    public String getID_NUMBER() {
        return ID_NUMBER;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
