import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] brr = new int[arr.length];
        cy(brr,arr);
        System.out.println(Arrays.toString(brr));
    }

    public static void copyS(int[] dest, int[] src){
        System.arraycopy(src, 0, dest, 0, src.length);
    }

    public static void cy(int[] dest, int[] src){
        for(int i =0;i<src.length;i++){
            dest[i]=src[i];
        }
    }

    public static void main7(String[] args) {
        int[] arr = new int[100];
        setS(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void setS(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public static void main6(String[] args) {
        int[] arr = {1, 2, 3, 4};
        pArray(arr);
    }

    public static void pArray(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static void main5(String[] args) {
        int[] arr = {1, 2, 3, 4};
        transForm(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void transForm(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

    public static void main3(String[] args) {
        int[] arr = {2, 3, 4};
        System.out.println(train1(arr));
    }

    public static int train1(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
//        return sum / arr.length;
        return sum;
    }

    public static void main2(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        String str = convertToString(arr);
        System.out.println(str);
    }

    public static String convertToString(int[] array) {
        String str = "";
        for (int x : array) {
            str += x;
        }
        return str;
    }

    public static void test() {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] brr = str.toCharArray();
        for (char x : brr) {
            System.out.print(x + " ");
        }
        System.out.println();
        String ptr = Arrays.toString(brr);
        System.out.println(ptr);
    }

}
