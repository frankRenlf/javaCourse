package structure;

import java.lang.reflect.Array;
import java.util.Arrays;

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

    private int[] elem;
    private int usedSize;

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

    private void shiftUp(int child) {
        int parent = (child - 1) / 2;

        while (child > 0) {
            if (elem[child] > elem[parent]) {
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                child = parent;
                parent = (child - 1) / 2;
            } else {
                break;
            }
        }
    }

    public void push(int val) {
        if (checkCapacity()) {
            expansion();
        }
        elem[usedSize] = val;
        shiftUp(usedSize);
        usedSize++;
    }

    public void expansion() {
        elem = Arrays.copyOf(elem, usedSize * 2);
    }

    public boolean checkCapacity() {
        return usedSize == elem.length;
    }

    public void pollHeap() {
        if (isEmpty()) {
            System.out.println();
            return;
        }
        int tmp = elem[usedSize - 1];
        elem[usedSize - 1] = elem[0];
        elem[0] = tmp;
        shiftDown(0, usedSize - 1);
        usedSize--;
    }

    public boolean isEmpty() {
        return usedSize == 0;
    }

    public int peekHeap() {
        if (isEmpty()) {
            return -1;
        }
        return elem[0];
    }

    public void display() {
        for (int i = 0; i < usedSize; i++) {
            System.out.print(elem[i] + " ");
        }
    }

}
