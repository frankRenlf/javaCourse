package structure;

import java.lang.reflect.Array;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_5_27
 * @Package : structure
 * @createTime : 2022/5/27 12:40
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
public class TestHeap_E<E> {

    public E[] elem;
    public int usedSize;
    private int capacity = 10;

    public TestHeap_E(Class<E> clazz) {
        elem = (E[]) Array.newInstance(clazz, this.capacity);
    }

    public TestHeap_E(Class<E> clazz, int capacity) {
        elem = (E[]) Array.newInstance(clazz, capacity);
    }

//    private void shiftDown(int root, int len) {
//        int par = root;
//        int chi = 2 * par + 1;
//        while(chi<len){
//            if(chi+1<len&&elem[chi]<elem[chi+1]){
//
//            }
//        }
//    }

    public void createHeap(E[] array) {
        usedSize = array.length;
        System.arraycopy(array, 0, elem, 0, usedSize);
        for (int p = (usedSize - 1 - 1) / 2; p >= 0; p--) {
//            shiftDown(p, usedSize);
        }
    }

    public void display() {
        for (int i = 0; i < usedSize; i++) {
            System.out.print(elem[i] + " ");
        }
    }

}
