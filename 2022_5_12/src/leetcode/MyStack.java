package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class MyStack {

    List<Integer> list = new LinkedList<>();


    public MyStack() {

    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        return list.remove(list.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public boolean empty() {
        return list.isEmpty();
    }
}

class MyStack2 {

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public MyStack2() {

    }

    public void push(int x) {
        if (!queue1.isEmpty()) {
            queue1.offer(x);
        } else if (!queue2.isEmpty()) {
            queue2.offer(x);
        } else {
            queue1.offer(x);
        }
    }

    public int pop() {
        if (!queue1.isEmpty()) {
            int size = queue1.size() - 1;
            for (int i = 0; i < size; i++) {
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        } else {
            int size = queue2.size() - 1;
            for (int i = 0; i < size; i++) {
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }
    }

    public int top() {
        int tmp = -1;
        if (!queue1.isEmpty()) {
            int size = queue1.size();
            for (int i = 0; i < size; i++) {
                tmp = queue1.poll();
                queue2.offer(tmp);
            }
        } else {
            int size = queue2.size();
            for (int i = 0; i < size; i++) {
                tmp = queue2.poll();
                queue1.offer(tmp);
            }
        }
        return tmp;
    }

    public boolean empty() {
        return queue1.isEmpty() || queue2.isEmpty();
    }
}
