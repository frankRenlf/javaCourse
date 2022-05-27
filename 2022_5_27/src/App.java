import structure.TestHeap;
import structure.TestHeap_E;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_5_27
 * @Package : PACKAGE_NAME
 * @createTime : 2022/5/27 10:34
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
public class App {

    public static void main(String[] args) {
        TestHeap testHeap = new TestHeap(10);
        testHeap.createHeap(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        testHeap.push(50);
        testHeap.display();

    }

    public static void main1(String[] args) {
        Integer[] array = new Integer[]{1, 3, 5, 6, 6, 7, 8, 9, 10, 12};
        TestHeap_E<Integer> testHeap = new TestHeap_E<>(Integer.class);
        testHeap.createHeap(array);
        testHeap.display();
    }

}