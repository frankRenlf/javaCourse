package impl;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_7_2
 * @Package : impl
 * @createTime : 2022/7/2 15:19
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
public class Solution {

    public void func1(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        System.out.println(set);
    }

    public void func2(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int x : arr) {
            if (map.get(x) == 1) {
                System.out.println(x);
                break;
            }
        }
    }

    public void func3(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        System.out.println(map);
//        for (Map.Entry<Integer, Integer> elem : map.entrySet()) {
//            System.out.println(elem);
//        }
    }

}
