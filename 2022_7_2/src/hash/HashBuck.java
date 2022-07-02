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
public class HashBuck<K, V> {

    static class Node<K, V> {
        K key;
        V val;
        Node<K, V> next;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
            this.next = null;
        }
    }

    private Node<K, V>[] array;
    private int usedSize;
    private static final int DEFAULT_SIZE = 5;
    private static final double DEFAULT_LOAD_FACTOR = 0.75;
    private static final int DEFAULT_EXTEND_COEFFICIENT = 1;

    public HashBuck() {
        array = new Node[DEFAULT_SIZE];
    }

    // add element
    public void put(K key, V val) {
        Node<K, V> node = new Node<>(key, val);
        int index = key.hashCode() % array.length;
        Node<K, V> cur = array[index];
        while (cur != null) {
            if (cur.key.equals(key)) {
                cur.val = val;
                return;
            }
            cur = cur.next;
        }
        node.next = array[index];
        array[index] = node;
        usedSize++;

        if (overLoadFactor()) {
            resize();
        }

    }

    private void resize() {
        Node<K, V>[] tmp = new Node[array.length + DEFAULT_EXTEND_COEFFICIENT * DEFAULT_SIZE];
        for (int i = 0; i < array.length; i++) {
            Node<K, V> cur = array[i];
            while (cur != null) {
                int index = cur.key.hashCode() % tmp.length;
                Node<K, V> curNext = cur.next;
                cur.next = tmp[index];
                tmp[index] = cur;
                cur = curNext;
            }
        }
        array = tmp;
    }

    private boolean overLoadFactor() {
        return loadFactor() >= DEFAULT_LOAD_FACTOR;
    }

    private double loadFactor() {
        return usedSize * 1.0 / array.length;
    }

    // get element
    public V get(K key) {
        int index = key.hashCode() % array.length;
        Node<K, V> cur = array[index];
        while (cur != null) {
            if (cur.key.equals(key)) {
                return cur.val;
            }
            cur = cur.next;
        }
        return null;
    }

}
