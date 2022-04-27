import sqlist.MyArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class App {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5); // 使用下标+for遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(); // 借助foreach遍历
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        Iterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void main3(String[] args) {
        MyArrayList mal1 = new MyArrayList(new int[]{1, 2, 3, 4, 5});
        mal1.newArray(new int[]{2, 4, 7, 8, 2, 4, 5, 2, 1});
        mal1.display();
        mal1.add(1);
        mal1.display();
    }

    public static void main2(String[] args) {
//        List myList = new List();
    }

    public static void main1(String[] args) {
        MyArrayList mal1 = new MyArrayList(new int[]{1, 2, 3, 4, 5});
        mal1.add(2, 6);
        mal1.display();
        mal1.remove(2);
        mal1.display();
        mal1.remove(10);
        mal1.display();
        System.out.println(mal1.get(2));

//        MyArrayList mal2 = new MyArrayList();
//        mal2.display();


        mal1.clear();
        mal1.display();

        mal1.add(5);
        mal1.add(4);
        mal1.display();


    }

}
