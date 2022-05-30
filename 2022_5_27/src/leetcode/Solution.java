package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_5_27
 * @Package : leetcode
 * @createTime : 2022/5/29 10:32
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
public class Solution {

    public int[] smallestK(int[] arr, int k) {
        int[] ret = new int[k];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int x : arr) {
            priorityQueue.offer(x);
        }
        while (k > 0) {
            k--;
            ret[k] = priorityQueue.poll();
        }

        return ret;
    }

    static class IntCmp implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

    public int[] smallestK2(int[] arr, int k) {
        int[] ret = new int[k];
        IntCmp intCmp = new IntCmp();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, intCmp);
        for (int i = 0; i < k; i++) {
            priorityQueue.offer(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.offer(arr[i]);
            }
        }
        for (int i = 0; i < k; i++) {
            ret[i] = priorityQueue.poll();
        }
        return ret;
    }

}
