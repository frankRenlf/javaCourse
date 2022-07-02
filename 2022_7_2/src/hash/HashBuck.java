package hash;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_7_2
 * @Package : hash
 * @createTime : 2022/7/2 11:13
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
public class HashBuck {

    static class Node {
        int key;
        int val;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.next = null;
        }
    }

    private Node[] array;
    private int usedSize;

    public HashBuck() {
        array = new Node[10];
    }

    // add element
    public void put(int key, int val) {

    }

    // get element
    public void get(int key) {

    }

}
