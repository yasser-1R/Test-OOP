package views;

import java.util.List;
import java.util.Scanner;

import models.Book;

public class BorrowView {
    public static int view(List<Book> books){

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\n\nEnter Book ID to borrow: ");
        System.out.println("\n");
        for(Book book:books){
            book.displayInfo();
        }
        System.out.println("\n");
        int bookId = Integer.parseInt(scanner.nextLine());
        return bookId;
    }
}
