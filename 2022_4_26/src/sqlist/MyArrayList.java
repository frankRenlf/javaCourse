package sqlist;

import sqlist.ArrayException.ArrayOutOfRange;

import java.util.Arrays;

public class MyArrayList {

    private int usedSize;
    private int[] array;

    private static final int DefaultSize = 10;

    public MyArrayList() {
        this.array = new int[DefaultSize];
    }

    public MyArrayList(int[] array) {
        this.usedSize = array.length;
        this.array = array;
    }

    public MyArrayList(int usedSize, int[] array) {
        this.usedSize = usedSize;
        this.array = array;
    }

    public void newArray(int[] newArray) {
        this.array = newArray;
        this.usedSize = newArray.length;
    }

    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.array[i] + " ");
        }
        System.out.println();
    }

    //是否填满
    public boolean isFull() {
        return this.usedSize == this.array.length;
    }

    //扩容
    public void CapacityExpansion() {
        this.array = Arrays.copyOf(this.array, this.usedSize >> 1 + this.usedSize);
    }

    // 新增元素,默认在数组最后新增
    public void add(int data) {
        if (isFull()) {
            CapacityExpansion();
        }
        this.array[this.usedSize] = data;
        this.usedSize++;
    }

    public boolean checkIndex(int pos) {
        return pos <= this.usedSize && pos >= 0;
    }

    public void isValid(int pos) {
        if (!checkIndex(pos)) {
            throw new ArrayOutOfRange("Invalid index");
        }
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        isValid(pos);
        if (isFull()) {
            CapacityExpansion();
        }
        if (this.usedSize - pos >= 0) {
            System.arraycopy(this.array, pos, this.array, pos + 1, this.usedSize - pos);
        }
        this.array[pos] = data;
        this.usedSize++;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int x : this.array) {
            if (x == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int indexOf(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if (this.array[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int get(int pos) {
        isValid(pos);
        return this.array[pos];
    }

    // 给 pos 位置的元素设为 value
    public void set(int pos, int value) {
        isValid(pos);
        this.array[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int key) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.array[i] == key) {
                System.arraycopy(this.array, i + 1, this.array, i, this.usedSize - i - 1);
                this.usedSize--;
                return;
            }
        }
        System.out.println("No such data");
    }

    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }

}
