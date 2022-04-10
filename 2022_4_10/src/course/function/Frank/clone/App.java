package course.function.Frank.clone;

class Property implements Cloneable {

    public double cash;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class House implements Cloneable {

    public int number;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


class Person implements Cloneable {

    public String id;

    Property property1 = new Property();
    House house1 = new House();

    public Person(String id, double cash, int number) {
        this.id = id;
        this.property1.cash = cash;
        this.house1.number = number;
    }

    public Person(String id, double cash) {
        this.id = id;
        this.property1.cash = cash;
    }

    public Person(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + this.id + '\'' +
                ", property1=" + this.property1.cash +
                ", house1=" + this.house1.number +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tmp = (Person) super.clone();
        tmp.property1 = (Property) this.property1.clone();
        tmp.house1 = (House) this.house1.clone();

        return tmp;
    }
}


public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("1234", 12.3, 3);
        System.out.println(p1);
        Person p2 = (Person) p1.clone();
        System.out.println(p2);
        p2.property1.cash = 20.0;
        p1.property1.cash = 52.1;
        p1.house1.number = 2;
        p2.house1.number = 10;
        System.out.println(p1);
        System.out.println(p2);
    }

}
