/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.booklab03;

import java.util.Scanner;

public class BookLab03 {
     String title;
     String author;
     int year;
     static String genre;
     static int bookCount = 0;

    // Parameterized constructor
    public BookLab03(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        bookCount++;
    }

    
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
    }

    
    public static void displayTotalBooks() {
        System.out.println("Total books: " + bookCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Genre of the books: ");
        genre = scanner.nextLine();

        System.out.print("Title of book 1: ");
        String title1 = scanner.nextLine();
        System.out.print("Author of book 1: ");
        String author1 = scanner.nextLine();
        System.out.print("Year of book 1: ");
        int year1 = scanner.nextInt();
        scanner.nextLine(); 

        BookLab03 book1 = new BookLab03(title1, author1, year1);

        System.out.print("Title of book 2: ");
        String title2 = scanner.nextLine();
        System.out.print("Author of book 2: ");
        String author2 = scanner.nextLine();
        System.out.print("Year of book 2: ");
        int year2 = scanner.nextInt();
        scanner.nextLine(); 

        BookLab03 book2 = new BookLab03(title2, author2, year2);

        System.out.print("Title of book 3: ");
        String title3 = scanner.nextLine();
        System.out.print("Author of book 3: ");
        String author3 = scanner.nextLine();
        System.out.print("Year of book 3: ");
        int year3 = scanner.nextInt();
        scanner.nextLine(); 

        BookLab03 book3 = new BookLab03(title3, author3, year3);

        // Display book details
        System.out.println("\nDetails of The Book 1:");
        book1.displayDetails();
        System.out.println("\nDetails Of The Book 2:");
        book2.displayDetails();
        System.out.println("\nDetails Of The Book 3:");
        book3.displayDetails();

        
        BookLab03.displayTotalBooks();
    }
}

