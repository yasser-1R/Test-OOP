package views;

import java.util.Scanner;


public class AuthView {
    public static String[] view(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n\n===== Welcome to the Library System =====");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        return new String[] { username, password };

    }
}
