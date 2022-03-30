import parent.child.*;

public class App {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setInfo("A", 2, 10.0);
        dog1.eat();
        dog1.voice();
        dog1.getInfo();
    }

}
