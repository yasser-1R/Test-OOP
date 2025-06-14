package controller;

import java.util.List;

import models.Book;
import models.User;
import services.LibraryService;
import views.BooksListView;
import views.BorrowView;
import views.BorrowedBooksView;
import views.MenuView;
import views.ReturnView;

public class MenuController {
    public static void begin(User user,List<Book> books){
        int choice = MenuView.view(user.getUserName());
            switch(choice){
                case 1 ->{
                    BooksListView.view(books);
                    break;
                }
                case 2 ->{
                    int bookId = BorrowView.view(books);
                    LibraryService.borrowBook(user,LibraryService.findBookById(books, bookId));
                    break;
                }
                case 3 ->{
                    int bookId = ReturnView.view(user.getBooksBorrowed());
                    LibraryService.returnBook(user, LibraryService.findBookById(books, bookId));
                    break;
                }
                case 4 ->{
                    BorrowedBooksView.view(user.getBooksBorrowed());
                    break;
                }
//not completed
            }
    }
}
