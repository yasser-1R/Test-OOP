package services;

import java.util.List;

import models.*;


public class LibraryService {

    public static void borrowBook(User user , Book book){
        if(user.getMaxBorrow() <= user.getNumBorrow()){
            System.out.println(user.getUserName() + " reach borrow limit");
        }else{
            if(book.getInStock()<=0){
                System.out.println(book.getTitle() + " out of stock");
            }else{
                book.setInStock(book.getInStock()-1);;
                user.addBook(book);
                user.setNumBorrow(user.getNumBorrow()+1);
            }
        }
    }

    public static void returnBook(User user, Book book){
        if(!user.getBooksBorrowed().contains(book)){
            System.out.println(book.getTitle() + " is not borrowed by" + user.getUserName());
        }else{
            book.setInStock(book.getInStock()+1);;
            user.removeBook(book);
            user.setNumBorrow(user.getNumBorrow()-1);
        }
    }

    public static Book findBookById(List<Book> books , int id){
        for(Book book:books){
            if(book.getId()==id){
                return book;
            }
        }
        return null;
    }


}