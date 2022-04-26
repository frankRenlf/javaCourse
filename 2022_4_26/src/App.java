import sqlist.MyArrayList;

import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {

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
