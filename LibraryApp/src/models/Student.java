package models;

public class Student extends User{

    private String major;
    
    public Student(int id,String userName,String password,String major){
        super(id,userName,password);
        this.major = major;
        this.setMaxBorrow(3);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayInfo(){
        System.out.println("student id : " + this.getId() + "name : " + this.getUserName() + "major : " + this.getMajor());
    }

}