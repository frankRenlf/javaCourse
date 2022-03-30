package parent;

public class Animal {

    public int a = 0;

    private String name;
    private int age;
    private double weight;

    public void setInfo(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void getInfo() {
        System.out.println("Name: " + this.name + '\n' + "Age: " + this.age + '\n' + "Weight: " + this.weight);
    }

    public void eat() {
        System.out.println("eating");
    }
}


