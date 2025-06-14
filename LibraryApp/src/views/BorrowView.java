package views;

import java.util.List;
import java.util.Scanner;

import models.Book;
import models.User;

public class BorrowView {
    public static int view(User user,List<Book> books){

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\n\nEnter Book ID to borrow: ");
        int bookId = Integer.parseInt(scanner.nextLine());
        return bookId;
    }
}
