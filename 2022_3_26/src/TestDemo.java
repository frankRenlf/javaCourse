public class TestDemo {

    public TestDemo(){

    }

    private float f=1.0f;

    int m=12;

    static int n=1;

    public static void main(String[] args) {
        TestDemo test = new TestDemo();
        test.f = 10.0F;
//        this.n = 10;
//        TestDemo.m = 10;
        TestDemo.n = 15;
    }
}
