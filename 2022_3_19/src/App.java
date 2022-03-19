public class App {

    public static void main(String[] args) {
        //decided(24);
        //decided2(8);
        System.out.println(fac(5));;
    }

    public static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }


    public static void decided2(int n) {
        if ((n & (n - 1)) == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }


    public static void decided(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        System.out.println(count);
    }
}
