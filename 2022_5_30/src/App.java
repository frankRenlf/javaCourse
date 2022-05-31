import function.Sorts;

import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_5_30
 * @Package : PACKAGE_NAME
 * @createTime : 2022/5/30 14:32
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
public class App {

    public static int[] createArray() {
        int[] arr = new int[10_0000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10_0000);
        }
        return arr;
    }

    public static void testSort() {
        int[] arr = createArray();
        long startTime = System.currentTimeMillis();
        Sorts sorts = new Sorts();
        sorts.heapSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Time consume: " + (endTime - startTime));

    }

    public static void main(String[] args) {
//        int[] arr = new int[]{1, 5, 2, 3, 7, 4, 5};
//        System.out.println(Arrays.toString(arr));
        testSort();
    }

}
