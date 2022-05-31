package function;

import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_5_30
 * @Package : function
 * @createTime : 2022/5/31 14:16
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
public class TestSorts {

    public int[] array;

    public TestSorts() {
        this.array = createArray();
    }

    public int[] createArray() {
        array = new int[10_0000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10_0000);
        }
        return array;
    }


    public int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, array.length);
    }

    public void testHeapSort() {
        int[] arr = copyArray(array);
        long startTime = System.currentTimeMillis();
        Sorts sorts = new Sorts();
        sorts.heapSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Time consume: " + (endTime - startTime));

    }

    public void testShellSort() {
        int[] arr = copyArray(array);
        long startTime = System.currentTimeMillis();
        Sorts sorts = new Sorts();
        sorts.shellSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Time consume: " + (endTime - startTime));

    }


    public void testQuickSort() {
        int[] arr = copyArray(array);
        long startTime = System.currentTimeMillis();
        Sorts sorts = new Sorts();
        sorts.quickSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Time consume: " + (endTime - startTime));

    }
}
