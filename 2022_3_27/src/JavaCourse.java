/*
 * AUTHOR: Frank
 * DATE: 2022 3 27
 * CONTENT: class
 */

import static java.lang.Math.pow;

class Person{

    public int age;
    public String name;
    public int score;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}


public class JavaCourse {

    public static void main(String[] args) {
        System.out.println(pow(1,2));
    }

}
