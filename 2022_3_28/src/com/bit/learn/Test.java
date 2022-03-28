package com.bit.learn;


class Student {
    private int age;
    private String name;
    private double score;
    private static String classNo;

    public void leaClass(){
        System.out.println(this.age);
        System.out.println(classNo);
    }

    public static void doClass() {
        System.out.println("On class"+classNo);
    }

    public Student(int age, String name, double score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public static String getClassNo() {
        return classNo;
    }

    public static void setClassNo(String classNo) {
        Student.classNo = classNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score + '\'' +
                ", classNo=" + classNo +
                '}';
    }
}


public class Test {

    public static void main(String[] args) {
        Student stu1 = new Student(12, "Frank", 98.3);
        System.out.println(stu1);
        Student.setClassNo("java");
        System.out.println(stu1);
        Student.doClass();
    }

}
