package views;

import java.util.Scanner;

public class MenuView {
    public static int view(String username){

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n\nWelcom " + username);
        System.out.println("\n Menu ");
        System.out.println("1. View available books");
        System.out.println("2. Borrow a book");
        System.out.println("3. Return a book");
        System.out.println("4. View my borrowed books");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");

        String input = scanner.nextLine();
        int choice;
        choice = Integer.parseInt(input);
        return choice;
    }
}
