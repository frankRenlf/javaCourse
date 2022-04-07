package com.bit.Frank;


interface A {
    int a = 1;
    public static final int b = 2;

    default void test1() {
        System.out.println("default");
    }

    static void test2() {
        System.out.println("static");
    }

    int test3(int a);


}

class B implements A {

    @Override
    public void test1() {
        System.out.println("Override");
    }

    @Override
    public int test3(int a) {
        System.out.println("init");
        return 1;
    }

}

class C implements A {

    @Override
    public int test3(int a) {
        return a * 2;
    }
}

public class TestDemo2 {

    public static void main(String[] args) {
        A b = new B();
        b.test1();
        A c = new C();
        System.out.println(c.test3(2));
    }

}
