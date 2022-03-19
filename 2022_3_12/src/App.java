import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //multiN();
        //simulateKey();
        //countOne();
        //printB();
        //maxi();
        //decided();
        for(int i =1;i<=100;i++){
            primeNumber(i);
        }
    }

    public static void primeNumber(int n) {
        int maxi = (int) Math.sqrt(n);
        int flg = 1;
        for(int i =2;i<=maxi;i++){
            if(n%i==0){
                flg = 0;
                //System.out.println("Not");
                break;
            }
        }
        if(flg==1){
            System.out.print(n+" ");
        }

    }


    public static void decided() {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        for (int a = 0; a <= 999; a++) {
            int k =a;
            int sum = 0;
            while (k != 0) {
                sum += Math.pow(k % 10, 3);
                k /= 10;
            }
            if (sum == a) {
                System.out.println(a);
            }
        }

    }

    public static void maxi() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a % b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        System.out.println(b);
    }

    public static void printB() {
        Scanner sc = new Scanner(System.in);
        int odd = sc.nextInt();
        int even = odd;
        int k = 1;
        for (int i = 0; i < 32; i++) {

        }
    }

    public static void countOne() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        System.out.println(count);
    }

    public static void simulateKey() {
        String arr = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String brr = sc.nextLine();
            if (arr.equals(brr)) {
                System.out.println("right");
                break;
            } else {
                System.out.println("wrong");
            }
        }
    }

    public static void multiN() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    public static void test7(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int r = rd.nextInt(100);
        double rnd = Math.random();
        while (true) {
            int n = sc.nextInt();
            if (n == r) {
                System.out.println("True");
                break;
            } else if (n > r) {
                System.out.println("bigger");
            } else {
                System.out.println("smaller");
            }
        }
        // test3();
    }

    public static void test6(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            System.out.println(n * n);
        }
    }


    public static void test5(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum2 += i;
                continue;
            }
            sum1 += i;
        }
        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
    }

    public static void test4(String[] args) {
        int n = 5;
        while (n <= 100) {
            if (n % 3 == 0) {
                System.out.println(n);
            }
            n += 5;
        }

    }

    public static void test3() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(10);
        int sum = 0;
        int k = 1;
        for (int i = 1; i <= n; i++) {
            k *= i;
            sum += k;
        }
        System.out.println(sum);
    }

    public static void test2(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    public static void yes(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        switch (a) {
            case 1:
                int c = 0;
                System.out.println(c);
            case 2:
                int b = 10;
                System.out.println(b);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
