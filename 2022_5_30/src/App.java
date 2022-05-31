import function.Sorts;
import function.TestSorts;

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



    public static void main2(String[] args) {
//        Arrays.sort();
        TestSorts testSorts = new TestSorts();
        testSorts.testQuickSort();
        testSorts.testShellSort();
        testSorts.testHeapSort();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 2, 3, 7, 4, 5};
        Sorts sorts = new Sorts();
        sorts.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
