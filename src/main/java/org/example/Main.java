package org.example;

import org.example.model.Student;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    private static Student student;

    public static void main(String[] args) throws Exception {

        int choice = 1;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n===============================================\n");
            System.out.println("Unit Testing Java and Spring boot applications\n");
            System.out.println("===============================================\n");

            getMenu();
            choice = in.nextInt();

            switch (choice){
                case 1:
                    Student registerStudent = registerStudent(in);
                    break;
                case 2:
                    Boolean userFound = viewUserDetails();
                    break;
                case 3:
                    Boolean hasRegistered = registerForFinance(student);
                    break;
                case 4:
                    Boolean hasRegAcc = registerAccommodation();
                    break;
                case 5:
                    Boolean hasRegUnit = registerForUnits();
                    break;
                default:
                    choice = 1000;

            }

        } while (choice != 0);
        in.close();
    }

    public static Boolean registerForUnits() {
        if (student != null &&
                student.getHasDoneFinanceRegistration() &&
                student.getHasDoneAccommodationRegistration()){
            student.setHasDoneUnitRegistration(true);
        }

        return false;
    }

    public static Boolean registerAccommodation() {
        if (student != null && student.getHasDoneFinanceRegistration()){
            student.setHasDoneAccommodationRegistration(true);
            return true;
        }
        return false;
    }

    public static Boolean registerForFinance(Student student) throws Exception {

        if (student == null)
            throw new Exception("Student not found");

        if (student.getMoneyIn().intValue() > 5000){
            student.setHasDoneFinanceRegistration(true);
            return true;
        }

        return false;
    }

    public static Boolean viewUserDetails() {
        if (student != null)
            System.out.println(student);
        return student != null;
    }

    public static Student registerStudent(Scanner in) {
        System.out.println("Enter Student Details Below: \n");
        System.out.println("***************************\n");

        // get reg no
        System.out.print("Registration Number >> ");
        in.nextLine();
        String registrationNumber = in.nextLine();
        System.out.println();

        // get first name
        System.out.print("First Name >> ");
        String firstName = in.nextLine();
        System.out.println();

        // get second name
        System.out.print("Second Name >> ");
        String secondName = in.nextLine();
        System.out.println();

        // get academic year
        System.out.print("Academic Year >> ");
        Integer year = in.nextInt();
        System.out.println();

        // get semester
        System.out.print("Semester >> ");
        Integer sem = in.nextInt();
        System.out.println();

        // get initial amount
        System.out.print("Amount >> ");
        Integer amount = in.nextInt();
        System.out.println();

        student = new Student(registrationNumber, firstName, secondName,year, sem, new BigDecimal(amount));

        student.setMoneyIn(new BigDecimal(10000));
        return student;
    }

    public static void getMenu() {

        System.out.println("1. Register");
        System.out.println("2. View user details");
        System.out.println("3. Register Finance");
        System.out.println("4. Register Accommodation");
        System.out.println("5. Register Units");
        System.out.println("0. Exit Application");
        System.out.println("\n===============================================\n");
        System.out.print(">>\t");
    }
}