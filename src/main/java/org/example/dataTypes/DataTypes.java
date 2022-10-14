package org.example.dataTypes;

/**
 * @author christopherochiengotieno@gmail.com
 * @version 1.0.0
 * @since Friday, 14/10/2022
 */
public class DataTypes {
    public static void main(String[] args) {
         /*
         * Primitive Data Types
         *
         * There are eight primitive datatypes supported by Java.
         * Primitive datatypes are predefined by the language and named by a keyword.
         *
         * Source: https://www.tutorialspoint.com/java/java_basic_datatypes.htm
         * */

        /*
         * Byte data type is an 8-bit signed two's complement integer
         * Minimum value is -128 (-2^7)
         * Maximum value is 127 (inclusive)(2^7 -1)
         * Default value is 0
         * Byte data type is used to save space in large arrays, mainly in place of integers, since a byte is four times smaller than an integer.
         * */
        byte byteValue = 100;

        /*
         * Short data type is a 16-bit signed two's complement integer
         * Minimum value is -32,768 (-2^15)
         * Maximum value is 32,767 (inclusive) (2^15 -1)
         * Short data type can also be used to save memory as byte data type. A short is 2 times smaller than an integer
         * Default value is 0.
         * */
        short shortValue = 10000;

        /*
         * Int data type is a 32-bit signed two's complement integer.
         * Minimum value is - 2,147,483,648 (-2^31)
         * Maximum value is 2,147,483,647(inclusive) (2^31 -1)
         * Integer is generally used as the default data type for integral values unless there is a concern about memory.
         * The default value is 0
         * */
        int intVal = 100000;

        /*
         * Long data type is a 64-bit signed two's complement integer
         * Minimum value is -9,223,372,036,854,775,808(-2^63)
         * Maximum value is 9,223,372,036,854,775,807 (inclusive)(2^63 -1)
         * This type is used when a wider range than int is needed
         * Default value is 0L
         * */
        long longValue = 100000L;

        /*
         * Float data type is a single-precision 32-bit IEEE 754 floating point
         * Float is mainly used to save memory in large arrays of floating point numbers
         * Default value is 0.0f
         * Float data type is never used for precise values such as currency
         * Example: float f1 = 234.5f
         * */
        float floatValue = 234.5f;

        /*
         * double data type is a double-precision 64-bit IEEE 754 floating point
         * This data type is generally used as the default data type for decimal values, generally the default choice
         * Double data type should never be used for precise values such as currency
         * Default value is 0.0d
         * */
        double doubleValue = 123.4;

        /*
         * boolean data type represents one bit of information
         * There are only two possible values: true and false
         * This data type is used for simple flags that track true/false conditions
         * Default value is false
         * */
        boolean isTrue = true;

        /*
         * char data type is a single 16-bit Unicode character
         * Minimum value is '\u0000' (or 0)
         * Maximum value is '\uffff' (or 65,535 inclusive)
         * Char data type is used to store any character
         * */
        char letterA = 'A';

        //
        /*
         * Reference/Object Data Types
         *
         * Reference variables are created using defined constructors of the classes. They are used to access objects.
         * These variables are declared to be of a specific type that cannot be changed. For example, Employee, Puppy, etc.
         *
         * Class objects and various type of array variables come under reference datatype.
         * Default value of any reference variable is null.
         *
         * A reference variable can be used to refer any object of the declared type or any compatible type.
         *
         * Example:
         * */

        Animal animal = new Animal("giraffe");

    }
}
