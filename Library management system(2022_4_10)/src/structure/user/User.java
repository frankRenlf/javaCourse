package structure.user;

public abstract class User {

    protected String name;
//    protected String sex;
//    protected int age;

    public User(String name) {
        this.name = name;
    }

//    public User(String name, String sex, int age) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//    }

    public abstract int menu();

}
