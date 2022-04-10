package structure.user;

import java.util.Scanner;

public class Administrator extends User {
    public Administrator(String name) {
        super(name);
    }


//    public Administrator(String name, String sex, int age) {
//        super(name, sex, age);
//    }

    @Override
    public int menu(){
        System.out.println("Welcome admin: "+this.name+" to library");
        System.out.println("1.Display bookList");
        System.out.println("2.Add book");
        System.out.println("3.Delete book");
        System.out.println("4.Find book");
        System.out.println("0.Exit system");
        System.out.print("Enter choice: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}
