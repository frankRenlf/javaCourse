package Java.Course.Contain;

class A{
    int a = 1;
}

class B{
    int b =2;
}

class C{
    A a1;
    B b1;
}


public class Con1 {

    public static void main(String[] args) {
        C c1 = new C();
        c1.a1 = new A();
        c1.b1 = new B();
        System.out.println(c1.a1.a);
    }

}
