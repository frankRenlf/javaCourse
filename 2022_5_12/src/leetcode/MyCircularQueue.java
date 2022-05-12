package leetcode;

public class MyCircularQueue {

    private int[] elem;
    private int front = 0;
    private int rear = 0;

    public MyCircularQueue(int k) {
        elem = new int[k];
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        elem[rear] = value;
        rear = (rear + 1) % elem.length;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % elem.length;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return elem[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return elem[(rear == 0 ? elem.length : rear) - 1];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % elem.length == front;
    }
}
