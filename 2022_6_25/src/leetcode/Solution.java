package leetcode;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_6_25
 * @Package : leetcode
 * @createTime : 2022/6/30 18:58
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Solution {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> elem : map.entrySet()) {
            list.add(elem.getKey());
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o2) != map.get(o1) ? map.get(o2) - map.get(o1) : o1.compareTo(o2);
            }
        });
        return list.subList(0, k);
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Map<Node, Node> map = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            Node node = new Node(cur.val);
            map.put(cur, node);
            cur = cur.next;
        }
        Set<Map.Entry<Node, Node>> set = map.entrySet();
        for (Map.Entry<Node, Node> elem : set) {
            elem.getValue().next = map.get(elem.getKey().next);
            elem.getValue().random = map.get(elem.getKey().random);
        }
        return map.get(head);
    }

    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }
        int ret = 0;
        for (char x : stones.toCharArray()) {
            if (set.contains(x)) {
                ret++;
            }
        }
        return ret;
    }

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
        }
        return -1;
    }

}
