package models;

public abstract class User {

    private int id;
    private String userName;
    private String password;
    private int maxBorrow;

    public User(int id,String userName,String password){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.maxBorrow = 0;
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

    public int getMaxBorrow() {
        return maxBorrow;
    }

    public void setMaxBorrow(int maxBorrow) {
        this.maxBorrow = maxBorrow;
    }

    public abstract void displayInfo();

}