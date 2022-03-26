/*
 * DATE: 2022 2 26
 * AUTHOR: Frank
 *
 */


import java.util.Arrays;

class Person {
    private int age;
    public String name;
    public int score;

    public Person(int age, String name, int score) {
        this.score = score;
        this.age = age;
        this.name = name;
    }

    public Person() {
        this(12, "Frank.Ren", 60);
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        this.show();
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {

    }

    //    public void printPerson() {
//        System.out.println("Age: " + this.age + "\n" + "Name: " + this.name);
//    }

    public void show() {
        System.out.println("Age: " + this.age + " Name: " + this.name + " Score: " + this.score);
    }
}


public class App {

    private int count;

    public static void main(String[] args) {

        App test=new App(88);

        System.out.println(test.count);

    }

    App(int a) {

        count=a;

    }

//    static boolean Paddy;
//    public static void main(String args[]){
//        System.out.println(Paddy);
//    }

//    public class Test {
//        public int aMethod(){
//            static int i = 0;
//            i++;
//            return i;
//        }
//        public static void main(String args[]){
//            Test test = new Test();
//            test.aMethod();
//            int j = test.aMethod();
//            System.out.println(j);
//        }
//    }

//    public static void main(String[] args){
//
//        String s;
//
//        System.out.println("s="+s);
//
//    }

//    public static void main(String[] args) {
//        Person per3 = null;
//        per3.show();
//    }

    public static void main1(String[] args) {
        Person per1 = new Person();
        //per1.show();
        System.out.println(per1);
        //System.out.println(1);

        Person per2 = new Person(22, "Ren", 100);
        System.out.println(per2);
        //Per2.show();
    }
}
