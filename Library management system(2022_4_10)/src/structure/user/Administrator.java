package structure.user;

import structure.IO.IOperation;
import structure.manageBook.*;

import java.util.Scanner;

public class Administrator extends User {
    public Administrator(String name) {
        super(name);
        super.iOperations = new IOperation[]{
                new ExitSystem(),
                new DisplayBook(),
                new AddBook(),
                new DelBook(),
                new FindBook()
        };
    }

    @Override
    public void welcome() {
        System.out.println("==================");
        System.out.println("Welcome user:" + this.name + " to library");
    }


//    public Administrator(String name, String sex, int age) {
//        super(name, sex, age);
//    }

    @Override
    public int menu() {
        System.out.println("==================");
        System.out.println("1.Display bookList");
        System.out.println("2.Add book");
        System.out.println("3.Delete book");
        System.out.println("4.Find book");
        System.out.println("0.Exit system");
        System.out.print("Enter choice: ");
        Scanner sc = new Scanner(System.in);
        int ret = sc.nextInt();
        System.out.println("==================");
        return ret;
    }

}
