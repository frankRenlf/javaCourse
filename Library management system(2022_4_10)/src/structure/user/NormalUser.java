package structure.user;

import structure.IO.IOperation;
import structure.manageBook.*;

import java.util.Scanner;

public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.iOperations = new IOperation[]{
                new ExitSystem(),
                new DisplayBook(),
                new FindBook(),
                new BorrowBook(),
                new ReturnBook()
        };
    }

    @Override
    public void welcome() {
        System.out.println("==================");

        System.out.println("Welcome user:" + this.name + " to library");
    }


//    public NormalUser(String name, String sex, int age) {
//        super(name, sex, age);
//    }

    @Override
    public int menu() {
        System.out.println("==================");
        System.out.println("1.Display bookList");
        System.out.println("2.Find book");
        System.out.println("3.Borrow book");
        System.out.println("4.Return book");
        System.out.println("0.Exit system");
        System.out.print("Enter choice: ");
        Scanner sc = new Scanner(System.in);
        int ret = sc.nextInt();
        System.out.println("==================");
        return ret;
    }

}
