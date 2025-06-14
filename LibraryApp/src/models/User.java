package models;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

    private int id;
    private String userName;
    private String password;
    private int numBorrow;
    private int maxBorrow;
    private List<Book> booksBorrowed = new ArrayList<>();

    public User(int id,String userName,String password){
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumBorrow() {
        return numBorrow;
    }

    public void setNumBorrow(int numBorrow) {
        this.numBorrow = numBorrow;
    }

    public int getMaxBorrow() {
        return maxBorrow;
    }

    public void setMaxBorrow(int maxBorrow) {
        this.maxBorrow = maxBorrow;
    }

    public void addBook(Book book){
        this.booksBorrowed.add(book);
    }

    public void removeBook(Book book){
        this.booksBorrowed.remove(book);
    }

    public List<Book> getBooksBorrowed() {
        return booksBorrowed;
    }

    public abstract void displayInfo();

    // public void setBooksBorrowed(List<Book> booksBorrowed) {
    //     this.booksBorrowed = booksBorrowed;
    // }



}