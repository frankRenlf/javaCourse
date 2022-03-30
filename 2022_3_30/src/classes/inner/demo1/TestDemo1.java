package classes.inner.demo1;


class OutClass {

    public int x = 10;
    private int y = 20;
    static int c = 0;

    class InClass {
        public int a = 10;
        private int b = 20;
        static final int c = 30;
        //static int m = 0;
        OutClass OC;

        InClass(OutClass OC) {
            a = 20;
            this.OC = OC;
        }
    }

    static class InClass2 {
        public int a = 10;
        private int b = 20;
        static final int c = 30;
        static int m = 1;
        OutClass oc2;


        InClass2(OutClass oc) {
            this.oc2 = oc;
        }

        public void method() {
            this.a = 1;
            InClass2.m = 1;
            System.out.println(oc2.x);
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(m);
        }

    }

    static class StaticInClass {
        public int a = 10;
        private int b = 20;
        static int c = 30;
    }

    public void setX(int x) {
        this.x = x;
        int n = 1;
        c = 10;
    }

}


public class TestDemo1 {

    public static void main(String[] args) {
        OutClass outclass = new OutClass();
        OutClass.InClass inclass = outclass.new InClass(new OutClass());
        OutClass.InClass inclass2 = new OutClass().new InClass(new OutClass());
        OutClass.InClass2 inclass3 = new OutClass.InClass2(new OutClass());
        inclass3.method();
    }

}
