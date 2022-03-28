package com.bit.frank;

import com.bit.learn.Test.*;

public class TestDemo2 {
    public int a;
    private int b;
    int c;

    public TestDemo2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println(a);
    }

    public void printA() {
        System.out.println(this.a);
    }

    public static void main2(String[] args) {
        TestDemo1 test0 = new TestDemo1(1, 2, 3);
        System.out.println(test0.c + test0.a);
        System.out.println(test0.retA());
        TestDemo2 test2 = new TestDemo2(4, 5, 6);
        test2.printA();
    }

    public static void main(String[] args) {
//        Student stu1 = new Student(12,"Frank",98.3);
//        System.out.println(stu1);
    }

}
