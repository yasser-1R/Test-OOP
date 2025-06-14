package models;

public class Book {
    private int id;
    private String title;
    private int inStock;

    public Book(int id, String title, int inStock){
        this.id = id;
        this.title = title;
        this.inStock = inStock;
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

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public void displayInfo(){
        System.out.println("book id : " + this.id + " title : " + this.title + " in Stock : " + this.inStock);
    }

}
