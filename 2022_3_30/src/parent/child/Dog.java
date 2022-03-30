package parent.child;

import parent.Animal;

public class Dog extends Animal {

    public int a = 2;
    private static int l = 0;

    public void teat1(){
        System.out.println('1');
    }

    public static void test2(){
        //test1();
    }

    public void voice() {
        System.out.println(this.a + " bark");
        System.out.println(super.a + " bark");

    }

}
