package models;

public class Student extends User{

    private String major;
    
    public Student(int id,String userName,String password,String major){
        super(id,userName,password);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayInfo(){
        System.out.println("id : " + this.getId() + "username : " + this.getUserName() + "major : " + this.getMajor());
    }

}