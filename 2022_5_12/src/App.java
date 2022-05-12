import java.util.*;

public class App {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        deque.push(10);

        deque.pop();
        deque.poll();
    }

    public static void main3(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        System.out.println(stack.empty());
    }

    public static void main2(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        System.out.println(queue.isEmpty());
    }

    public static void main1(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.poll());

    }
}
