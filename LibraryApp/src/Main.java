import models.*;

import java.util.*;

import controller.AuthController;

public class Main {
    public static void main(String[] args) {
        // Step 1: Initialize fake data
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Clean Code", 2));
        books.add(new Book(2, "Design Patterns", 1));
        books.add(new Book(3, "Effective Java", 3));
        books.add(new Book(4, "Refactoring", 4));
        books.add(new Book(5, "The Pragmatic Programmer", 2));
        books.add(new Book(6, "Introduction to Algorithms", 5));
        books.add(new Book(7, "Artificial Intelligence: A Modern Approach", 2));
        books.add(new Book(8, "Java Concurrency in Practice", 1));
        books.add(new Book(9, "Domain-Driven Design", 2));
        books.add(new Book(10, "Head First Design Patterns", 3));

        User student1 = new Student(101, "alice", "pass123", "Computer Science");
        User student2 = new Student(102, "mohamed", "abc123", "Information Systems");
        User student3 = new Student(103, "nora", "cs456", "Software Engineering");

        User professor1 = new Professor(201, "bob", "secure456", "Engineering");
        User professor2 = new Professor(202, "dr_samira", "eng999", "Information Technology");
        User professor3 = new Professor(203, "dr_tariq", "prof321", "Computer Science");

        List<User> users = new ArrayList<>();
        users.add(student1);
        users.add(student2);
        users.add(student3);
        users.add(professor1);
        users.add(professor2);
        users.add(professor3);



        AuthController.begin(users,books);


    }    
}

