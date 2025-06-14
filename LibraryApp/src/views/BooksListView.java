package views;

import java.util.List;

import models.Book;

public class BooksListView {
    public static void view(List<Book> books){
        System.out.println("\n\n\nAvailable Books:");
        for(Book book:books){
            book.displayInfo();
        }
    }
}
