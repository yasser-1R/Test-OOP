package views;

import java.util.Scanner;

import models.User;
import services.AuthService;

public class AuthView {
    public static User view(AuthService authService){

        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Welcome to the Library System =====");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        User user = authService.authentification(username, password);

        if (user == null) {
            System.out.println("❌ Invalid credentials. Exiting...");
            return null;
        }
        return user;

    }
}
