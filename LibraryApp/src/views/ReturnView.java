package views;

import java.util.Scanner;

public class ReturnView {
    public static int view(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\n\nEnter Book ID to return: ");
        int bookId = Integer.parseInt(scanner.nextLine());
        return bookId;
    }
}
