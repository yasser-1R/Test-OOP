package views;

import java.util.List;

import models.Book;

public abstract class BorrowedBooksView {
    public static void view(List<Book> books){
        System.out.println("\n\n\nYour Borrowed Books:");
        for(Book book:books){
            book.displayInfo();
        }
    }
}
