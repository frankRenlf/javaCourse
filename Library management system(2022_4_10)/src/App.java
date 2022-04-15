import structure.book.*;
import structure.user.Administrator;
import structure.user.NormalUser;
import structure.user.User;

import java.util.Scanner;


public class App {


    public static User login() {
        System.out.print("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("1.Administrator\n2.NormalUser\nEnter identity: ");
        int identity = sc.nextInt();
        if (identity == 1) {
            return new Administrator(name);
        } else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
//        Book book1 = new Book("1", "a", "history", 12.3, true);
//        System.out.println(book1);
        BookList bookList = new BookList();
        User user = login();
        user.welcome();
        while (true) {
            int choice = user.menu();
            user.conductOperation(choice,bookList);
        }

    }


}
