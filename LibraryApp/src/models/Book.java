package models;

public class Book {
    private int id;
    private String title;
    private User borrowBy;

    public Book(int id, String title){
        this.id = id;
        this.title = title;
        this.borrowBy = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getBorrowBy() {
        return borrowBy;
    }

    public void setBorrowBy(User borrowBy) {
        this.borrowBy = borrowBy;
    }

    public void displayInfo(){
        if(this.borrowBy == null){
            System.out.println("book id : " + this.id + "title : " + this.title + "borrow by : No one");
        }else{
            System.out.println("book id : " + this.id + "title : " + this.title + "borrow by " + this.getBorrowBy().toString());
        }
    }

}
