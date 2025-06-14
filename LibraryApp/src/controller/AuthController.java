package controller;

import java.util.List;

import models.Book;
import models.User;
import services.AuthService;
import views.AuthView;

public class AuthController {

    public static void begin(List<User> users,List<Book> books){
        AuthService authService = new AuthService(users);
        String[] infoUser = AuthView.view();

        if(authService.authentification(infoUser[0],infoUser[1]) != null){
            User user = authService.findUserByName(infoUser[0]);
            MenuController.begin(user,books,users);
        }else{
            System.out.println("Authentification failed View ... ");
        }
    }
}
