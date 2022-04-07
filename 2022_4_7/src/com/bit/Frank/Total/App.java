package com.bit.Frank.Total;


interface IFlying {
    void fly();
}

interface IRunning {
    void run();
}

interface ISwimming {
    void swim();
}


class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Eating");
    }

}

class Dog extends Animal implements IRunning, ISwimming {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.name + " is eating");
    }

    @Override
    public void run() {
        System.out.println(this.name + " is running");
    }

    @Override
    public void swim() {
        System.out.println(this.name + " is swimming");
    }
}


public class App {

    public static void run(IRunning iRunning){
        iRunning.run();
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Scout");
        IRunning dog1 = new Dog("Tom");
        dog.eat();
        run(new Dog("tom1"));
        Dog dog2 = new Dog("lily");
        run(dog2);
    }

}
