package com.bit.Frank;

abstract class Shape {

    int a = 1;
    public abstract void draw();

}

class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("Cycle");
    }
}


abstract class Tri extends Shape{
    @Override
    public void draw() {
        System.out.println("Tri");
    }

    public abstract void test();
}

class Tri1 extends Tri{
    @Override
    public void test() {
        System.out.println("test");
    }
}


public class TestDemo1 {
    public static void main(String[] args) {
        Shape shape = new Cycle();
        System.out.println(shape.a);
        shape.draw();
        Tri Tri1 = new Tri1();
        Tri1.test();
    }
}
