package services;

import java.util.ArrayList;
import java.util.List;

import models.User;

public class AuthService {

    private List<User> users = new ArrayList<>();

    private AuthService(List<User> users){
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User user){
        if(this.users.contains(user)){
            System.out.println("the user " + user.getUserName() + "is aleready in the list");
        }else{
            this.users.add(user);
        }
    }

    public boolean authentification(String username,String password){
        for(User user:this.users){
            if(user.getUserName().equals(username) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
