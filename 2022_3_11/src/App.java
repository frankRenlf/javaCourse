import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        int a = 10;
////        System.out.println(a);
//        int a= 10;
//        int b=20;
//        System.out.println(a>b &&(a/0==0));
//        System.out.println(10 > 20 && 10 / 0 == 0); // 打印 false
//        System.out.println(10 < 20 || 10 / 0 == 0);
//        int a = 0xf;
//        System.out.printf("%x\n", ~a);
//        System.out.println(-10>>1);
//        int a = 10; int b = 20;
//        int c = a > b? 1 : 2;
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            int a = input.nextInt();
            if (a % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }


    public static void test(String[] args) {
        System.out.println("Test success");
    }
}
