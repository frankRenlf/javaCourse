package structure;

import java.lang.reflect.Array;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_5_27
 * @Package : structure
 * @createTime : 2022/5/27 13:18
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
public class TestHeap {

    public int[] elem;
    public int usedSize;

    public TestHeap(int capacity) {
        this.elem = new int[capacity];
    }

    private void shiftDown(int root, int len) {
        int parent = root;
        int child = 2 * parent + 1;
        while (child < len) {
            if (child + 1 < len && elem[child] < elem[child + 1]) {
                child++;
            }
            if (elem[child] > elem[parent]) {
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
        }
    }

    public void createHeap(int[] array) {
        usedSize = array.length;
        System.arraycopy(array, 0, elem, 0, usedSize);
        for (int p = (usedSize - 1 - 1) / 2; p >= 0; p--) {
            shiftDown(p, usedSize);
        }
    }

    public void display() {
        for (int i = 0; i < usedSize; i++) {
            System.out.print(elem[i] + " ");
        }
    }

}
