import java.util.*;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

//思路：
//1.分为两个链表,一个链表放小于x的节点，一个链表放大于等于x的节点
//2.连接两个链表
public class Solution {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int len = nums.length;
        int tmp = 0;
        for (int i = 0; i < len; i++) {
            tmp = Math.abs(nums[i]);
            if (nums[tmp - 1] > 0) {
                nums[tmp - 1] = -nums[tmp - 1];
            } else {
                list.add(tmp);
            }
        }
        return list;
    }


    public ListNode partition(ListNode pHead, int x) {
        // write code here
        //分为两个链表,一个链表放小于x的节点，一个链表放大于等于x的节点
        ListNode bs = null;//bs-->beforeStart
        ListNode bf = null;//bf-->beforeFinish
        ListNode as = null;//as-->afterStart
        ListNode af = null;//af-->afterFinish
        if (pHead == null) {
            return null;
        }
        while (pHead != null) {
            if (pHead.val < x) {
                //bs为null时
                if (bs == null) {
                    bs = pHead;
                    bf = pHead;
                } else {
                    bf.next = pHead;
                    bf = bf.next;
                }
            } else {
                //as为null时
                if (as == null) {
                    as = pHead;
                    af = pHead;
                } else {
                    af.next = pHead;
                    af = af.next;
                }
            }
            pHead = pHead.next;
        }
        //两个进行连接、
        //后面为空
        if (as == null) {
            return bs;
        }
        //若前面为null，去连接就会空指针异常
        if (bs == null) {
            return as;
        }
        bf.next = as;
        af.next = null;//最后一个next域要为null
        return bs;
    }

    public void display(ListNode p) {
        while (p != null) {
            System.out.println(p.val);
        }
    }
}
