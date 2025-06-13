package models;

public class Professor extends User{

    private String Departement;
    
    public Professor(int id,String userName,String password,String Departement){
        super(id, userName, password);
        this.Departement = Departement;
        this.setMaxBorrow(10);
    }

    public String getDepartement() {
        return Departement;
    }

    public void setDepartement(String departement) {
        Departement = departement;
    }

    @Override
    public void displayInfo(){
        System.out.println("professor id : " + this.getId() + "name : " + this.getUserName() + "departement : " + this.getDepartement());
    }
}