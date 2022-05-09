package mySingleList;

public class MySingleList {

    static class ListNode {
        private int value;
        private ListNode next;

        public ListNode() {
        }

        public ListNode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

    public ListNode head;

    public void createList(int n) {
        ListNode node = null;
        for (int i = 0; i < n; i++) {
            if (head == null) {
                head = new ListNode(i);
                node = head;
            } else {
                assert node != null;
                // tmp.setValue(i);
                node.setNext(new ListNode(i));
                node = node.getNext();
            }

        }
    }

    public void displayList() {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    public void displayList(ListNode x) {
        ListNode node = x;
        while (node != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        node.setNext(head);
        head = node;
    }

    //尾插法
    public void addLast(int data) {
        if (head == null) {
            head = new ListNode(data);
            return;
        }
        ListNode node = head;
        while (node.getNext() != null) {
            node = node.getNext();
        }
        node.setNext(new ListNode(data));
    }

    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index, int data) {
        ListNode node = head;
        if (index < 0) {
            return false;
        }
        if (index == 0) {
            addFirst(data);
            return true;
        }
        while (index > 1) {
            if (node.getNext() == null) {
                return false;
            }
            node = node.getNext();
            index--;
        }
        ListNode tmp = node.getNext();
        node.setNext(new ListNode(data));
        node.getNext().setNext(tmp);
        return true;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        ListNode node = head;
        while (node != null) {
            if (node.getValue() == key) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (head.getValue() == key) {
            head = head.getNext();
            return;
        }
        ListNode node = head;
        while (node.getNext() != null) {
            if (node.getNext().getValue() == key) {
                node.setNext(node.getNext().getNext());
                return;
            }
            node = node.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
//        while (head.getValue() == key) {
//            head = head.getNext();
//        }
//        ListNode node = head;
//        while (node != null && node.getNext() != null) {
//            if (node.getNext().getValue() == key) {
//                node.setNext(node.getNext().getNext());
//            }
//            node = node.getNext();
//        }
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        pre.setNext(head);
        while (pre.getNext() != null) {
            if (pre.getNext().getValue() == key) {
                pre.setNext(pre.getNext().getNext());
            } else {
                pre = pre.getNext();
            }
        }
        head = cur.getNext();
    }

    //得到单链表的长度
    public int size() {
        int size = 0;
        ListNode node = head;
        while (node != null) {
            size++;
            node = node.getNext();
        }
        return size;
    }

    public void clear() {
//        head = null;
        while (head != null) {
            ListNode pre = head.getNext();
            head.setNext(null);
            head = pre;
        }
    }

    public boolean chkPalindrome() {
        // write code here
        if (head == null || head.getNext() == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        ListNode cur = slow.getNext();
        while (cur != null) {
            ListNode curNext = cur.getNext();
            cur.setNext(slow);
            slow = cur;
            cur = curNext;
        }

        while (slow != head) {
            if (slow.getValue() != head.getValue()) {
                return false;
            }
            if (head.getNext() == slow) {
                return true;
            }
            slow = slow.getNext();
            head = head.getNext();
        }
        return true;
    }

    public ListNode partition(int x) {
        ListNode smaller = null;
        ListNode smallerHead = null;
        ListNode bigger = null;
        ListNode biggerHead = null;

        ListNode pHead = head;
        while (pHead != null) {
            if (pHead.getValue() < x) {
                if (smallerHead == null) {
                    smallerHead = pHead;
                    smaller = pHead;
                } else {
                    smaller.next = pHead;
                    smaller = smaller.next;
                }
            } else {
                if (biggerHead == null) {
                    biggerHead = pHead;
                    bigger = pHead;
                } else {
                    bigger.next = pHead;
                    bigger = bigger.next;
                }
            }
            pHead=pHead.getNext();
        }
        if(smallerHead==null){
            return biggerHead;
        }
        if(biggerHead==null){
            return smallerHead;
        }
        smaller.setNext(biggerHead);
        return smallerHead;
    }

}
