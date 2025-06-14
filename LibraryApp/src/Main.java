import models.*;
import views.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Initialize fake data
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "Clean Code", 2));
        bookList.add(new Book(2, "Design Patterns", 1));
        bookList.add(new Book(3, "Effective Java", 3));
        bookList.add(new Book(4, "Refactoring", 4));
        bookList.add(new Book(5, "The Pragmatic Programmer", 2));
        bookList.add(new Book(6, "Introduction to Algorithms", 5));
        bookList.add(new Book(7, "Artificial Intelligence: A Modern Approach", 2));
        bookList.add(new Book(8, "Java Concurrency in Practice", 1));
        bookList.add(new Book(9, "Domain-Driven Design", 2));
        bookList.add(new Book(10, "Head First Design Patterns", 3));

        User student1 = new Student(101, "alice", "pass123", "Computer Science");
        User student2 = new Student(102, "mohamed", "abc123", "Information Systems");
        User student3 = new Student(103, "nora", "cs456", "Software Engineering");

        User professor1 = new Professor(201, "bob", "secure456", "Engineering");
        User professor2 = new Professor(202, "dr_samira", "eng999", "Information Technology");
        User professor3 = new Professor(203, "dr_tariq", "prof321", "Computer Science");

        List<User> userList = new ArrayList<>();
        userList.add(student1);
        userList.add(student2);
        userList.add(student3);
        userList.add(professor1);
        userList.add(professor2);
        userList.add(professor3);

        

    }    
}

