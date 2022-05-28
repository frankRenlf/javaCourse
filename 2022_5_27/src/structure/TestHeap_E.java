package structure;

import java.lang.reflect.Array;
import java.util.Comparator;


/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_5_27
 * @Package : structure
 * @createTime : 2022/5/27 12:40
 * @Email : sc19lr@leeds.ac.uk
 * @github : <a href="https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30">...</a>
 * @Description : Heap with <E>
 */
public class TestHeap_E<E> {

    public E[] elem;
    public int usedSize;
    private int capacity = 10;

    public TestHeap_E(Class<E> clazz, Comparator<? super E> comparator) {
        elem = (E[]) Array.newInstance(clazz, this.capacity);
        this.comparator = comparator;
    }

    public TestHeap_E(Class<E> clazz, int capacity, Comparator<? super E> comparator) {
        this.comparator = comparator;
        elem = (E[]) Array.newInstance(clazz, capacity);
    }



    private final Comparator<? super E> comparator;

    public int compareTo(E o1, E o2) {
        return (int) o1 - (int) o2;
    }


    private void shiftDown(int root, int len) {
        int parent = root;
        int child = 2 * parent + 1;
        while (child < len) {
            if (child + 1 < len && compareTo(elem[child], elem[child + 1]) < 0) {
                child++;
            }
            if (compareTo(elem[child], elem[parent]) > 0) {
                E tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
        }
    }


    public void createHeap(E[] array) {
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
