package Stack;

import java.util.Arrays;

public class MyStack<E> {

    private final int def = 5;
    private E[] elem;
    private int usedSize;

    public E[] getElem() {
        return elem;
    }

    public void setElem(E[] elem) {
        this.elem = elem;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public MyStack() {
        this.elem = (E[]) new Object[def];
        this.usedSize = 0;
    }

    public MyStack(E[] elem, int usedSize) {
        this.elem = elem;
        this.usedSize = usedSize;
    }

    private boolean checkCapacity() {
        return usedSize == elem.length;
    }

    private void extendCapacity() {
        this.elem = Arrays.copyOf(this.elem, this.elem.length + this.def);
    }

    public void push(E data) {
        if (checkCapacity()) {
            extendCapacity();
        }
        this.elem[this.usedSize++] = data;
    }

    public E peek() {
        if (empty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return this.elem[usedSize - 1];
    }

    public E pop() {
        if (empty()) {
            throw new RuntimeException("Stack is empty.");
        }
        E tmp = this.elem[--usedSize];
        this.elem[usedSize] = null;
        return tmp;
    }

    public boolean empty() {
        return usedSize == 0;
    }

    public int size() {
        return this.usedSize;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "def=" + def +
                ", elem=" + Arrays.toString(elem) +
                ", usedSize=" + usedSize +
                '}';
    }
}
