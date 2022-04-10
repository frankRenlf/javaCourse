package structure.user;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
    }


//    public NormalUser(String name, String sex, int age) {
//        super(name, sex, age);
//    }

    @Override
    public int menu(){
        System.out.println("Welcome user: "+this.name+" to library");
        System.out.println("1.Display bookList");
        System.out.println("2.Find book");
        System.out.println("3.Borrow book");
        System.out.println("4.Return book");
        System.out.println("0.Exit system");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}
