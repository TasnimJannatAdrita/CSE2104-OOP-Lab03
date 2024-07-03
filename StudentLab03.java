/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentlab03;

import java.util.Scanner;

public class StudentLab03 {
    // Object variables
     int id;
     String name;
     String department;
     double cgpa;

    
     static String university = "XYZ University";
     static int studentCount = 0;

    // Parameterized constructor
    public StudentLab03(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        studentCount++;
    }

    
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
    }

    
    public static void displayStudentCount() {
        System.out.println("Total number of students: " + studentCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter details for Student 1:");
        System.out.print("ID: ");
        int id1 = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Department: ");
        String department1 = scanner.nextLine();
        System.out.print("CGPA: ");
        double cgpa1 = scanner.nextDouble();

        // Input details for second student
        System.out.println("Enter details for Student 2:");
        System.out.print("ID: ");
        int id2 = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Department: ");
        String department2 = scanner.nextLine();
        System.out.print("CGPA: ");
        double cgpa2 = scanner.nextDouble();

        // Input details for third student
        System.out.println("Enter details for Student 3:");
        System.out.print("ID: ");
        int id3 = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Name: ");
        String name3 = scanner.nextLine();
        System.out.print("Department: ");
        String department3 = scanner.nextLine();
        System.out.print("CGPA: ");
        double cgpa3 = scanner.nextDouble();

        
        StudentLab03 student1 = new StudentLab03(id1, name1, department1, cgpa1);
        StudentLab03 student2 = new StudentLab03(id2, name2, department2, cgpa2);
        StudentLab03 student3 = new StudentLab03(id3, name3, department3, cgpa3);

        
        System.out.println("\nDetails of Student 1:");
        student1.displayDetails();

        System.out.println("\nDetails of Student 2:");
        student2.displayDetails();

        System.out.println("\nDetails of Student 3:");
        student3.displayDetails();

        
        System.out.println();
        StudentLab03.displayStudentCount();

        scanner.close();
    }
}

