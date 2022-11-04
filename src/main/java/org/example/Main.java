package org.example;

import org.example.model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
                    registerStudent(in);
                    break;
                case 2:
                    System.out.println("Details");
                    break;
                case 3:
                    System.out.println("Finance");
                    break;
                case 4:
                    System.out.println("Accommodation");
                    break;
                case 5:
                    System.out.println("Units");
                    break;
                default:
                    choice = 1000;

            }

            System.out.println(choice);
            System.out.flush();

        } while (choice != 0);
        in.close();
    }

    private static Student registerStudent(Scanner in) {
        System.out.println("Enter Student Details Below: \n");
        System.out.println("***************************\n");

        // get reg no
        System.out.print("Registration Number >> ");
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

        Student student = new Student(registrationNumber, firstName, secondName,year, sem);
        return student;
    }

    private static void getMenu() {

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