package com.bit.Frank.Three.Demo1;


import java.util.Arrays;
import java.util.Comparator;

//class Student implements Comparable<Student> {
//    public String name;
//    public int age;
//    public double score;
//
//    public Student(String name, int age, double score) {
//        this.name = name;
//        this.age = age;
//        this.score = score;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", score=" + score +
//                '}';
//    }
//
////    @Override
////    public int compareTo(Student o) {
////        return String.CASE_INSENSITIVE_ORDER.compare(this.name, o.name);
////    }
//
////    @Override
////    public int compareTo(Student o) {
////        return Integer.compare(this.age, o.age);
////    }
//}


class Student {
    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        return String.CASE_INSENSITIVE_ORDER.compare(this.name, o.name);
//    }

//    @Override
//    public int compareTo(Student o) {
//        return Integer.compare(this.age, o.age);
//    }
}


class AgeComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}

class StringComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
//    public int compare(Student o1, Student o2) {
//        return o1.name.compareTo(o2.name);
//    }
}


public class App {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Frank", 12, 91.0);
        students[1] = new Student("lily", 14, 90.0);
        students[2] = new Student("Tom", 10, 94.0);
        Arrays.sort(students, new StringComparator());
        System.out.println(Arrays.toString(students));
    }

}
