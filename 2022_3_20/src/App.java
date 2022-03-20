import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //dealString();
        //System.out.println(rec(5));
        //pch(123);
        //System.out.println(addN(10));
//        System.out.println(addM(123));
//        int[] arr = new int[]{1, 2, 3, 4, 5};
//        pS(arr, arr.length - 1);
        System.out.println(fib(6));
    }

    public static int fib(int n){
        if(n<=2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static int cmp(int a, int b){
        return Math.max(a, b);
    }

    public static double cmp(double a, double b){
        return Math.max(a, b);
    }

    public static double cmp(double a, double b, int c){
        return Math.max(a, b);
    }

        public static void pS(int[] arr, int n) {
        if (n == 0) {
            System.out.println(arr[0]);
        } else {
            System.out.println(arr[n]);

            pS(arr, n - 1);
        }
    }

    public static int addM(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + addM(n / 10);
    }

    public static int addN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + addN(n - 1);
    }

    public static void pch(int n) {
        if (n >= 10) {
            pch(n / 10);
        }
        System.out.print(n % 10 + " ");
    }

    public static int rec(int n) {
        if (n == 1) {
            return 1;
        }
        return n * rec(n - 1);
    }

    public static void dealString() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            System.out.print(c + " ");
        }
    }

}
