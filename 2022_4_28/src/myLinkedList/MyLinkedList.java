package myLinkedList;


public class MyLinkedList {

    static class ListNode {
        public int value;
        public ListNode pre;
        private ListNode next;

        public ListNode() {
        }

        public ListNode(int value) {
            this.pre = null;
            this.next = null;
            this.value = value;
        }
    }

    public ListNode head;
    public ListNode tail;

    //头插法
    public void addFirst(int data) {
        ListNode p = new ListNode(data);
        if (head == null) {
            tail = p;
        } else {
            p.next = head;
            head.pre = p;
        }
        head = p;

    }

    public void addLast(int data) {
        ListNode p = new ListNode(data);
        if (tail == null) {
            head = p;
        } else {
            tail.next = p;
            p.pre = tail;
        }
        tail = p;
    }

    public boolean addIndex(int index, int data) {
        if (index < 0 || index > size()) {
            System.out.println("index out of range");
            return false;
        }
        if (index == 0) {
            addFirst(data);
            return true;
        }
        if (index == size()) {
            addLast(data);
            return true;
        }
        ListNode p = new ListNode(data);
        ListNode cur = head;
        while (index > 0) {
            if (cur == null) {
                return false;
            }
            cur = cur.next;
            index--;
        }
        cur.pre.next = p;
        p.pre = cur.pre;
        p.next = cur;
        cur.pre = p;
        return true;
    }

    public boolean contains(int key) {
        ListNode p = head;
        while (p != null) {
            if (p.value == key) {
                return true;
            }
            p = p.next;
        }
        return false;
    }


    public void remove(int key) {
        ListNode p = head;
        while (p != null) {
            if (p.value == key) {
                delete(p);
                return;
            }
            p = p.next;
        }
    }

    public void removeAllKey(int key) {
        ListNode p = head;
        while (p != null) {
            if (p.value == key) {
                delete(p);
            }
            p = p.next;
        }
    }

    private void delete(ListNode p) {
        if (p.pre == null) {
            head = p.next;
            if (head != null) {
                head.pre = null;
            }
        } else {
            p.pre.next = p.next;
            if (p.next == null) {
                tail = p;
            } else {
                p.next.pre = p.pre;
            }
        }
    }

    public int size() {
        ListNode p = head;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    public void display() {
        ListNode p = head;
        while (p != null) {
            System.out.print(p.value + " ");
            p = p.next;
        }
        System.out.println();
    }

    public void clear() {
        head = null;
        tail = null;
    }


}
