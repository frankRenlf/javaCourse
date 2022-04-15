package structure.user;

import structure.IO.IOperation;
import structure.book.BookList;

public abstract class User {

    protected String name;
//    protected String sex;
//    protected int age;

    public IOperation[] iOperations;

    public User(String name) {
        this.name = name;
    }

//    public User(String name, String sex, int age) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//    }

    public void conductOperation(int choice, BookList bookList) {
        iOperations[choice].work(bookList);
    }

    public abstract void welcome();

    public abstract int menu();

}
