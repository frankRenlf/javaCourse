import myLinkedList.MyLinkedList;
import mySingleList.MySingleList;

public class TestList {

    public static void main(String[] args) {

        MyLinkedList linkedList2 = new MyLinkedList();
        linkedList2.addIndex(1,1);
        linkedList2.addIndex(0,1);
        linkedList2.addIndex(8,1);

        linkedList2.display();

        System.out.println("size: " + linkedList2.size());

        linkedList2.removeAllKey(1);
        linkedList2.display();
        System.out.println("size: " + linkedList2.size());


    }

    public static void main5(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        int n = 5;
        while (n > 0) {
            linkedList.addFirst(n);
            n--;
        }
        linkedList.display();

        System.out.println("size: " + linkedList.size());

        while (n < 5) {
            linkedList.addLast(n);
            n++;
        }
        linkedList.display();

        System.out.println("size: " + linkedList.size());

    }


    public static void main4(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(3);
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        mySingleList.addLast(3);
        mySingleList.addLast(1);
        mySingleList.addLast(1);
        mySingleList.addLast(3);
        mySingleList.addLast(2);
        mySingleList.addLast(1);
        mySingleList.addLast(3);


        System.out.print("Display: ");
        mySingleList.displayList();
        System.out.println("Size: " + mySingleList.size());
        System.out.println("================");

        mySingleList.displayList(mySingleList.partition(2));

//        System.out.println(mySingleList.chkPalindrome());

//        mySingleList.removeAllKey(1);
//        System.out.print("Display: ");
//        mySingleList.displayList();
//        System.out.println("Size: " + mySingleList.size());
//        System.out.println("================");
//
//        mySingleList.clear();
//        mySingleList.displayList();
//        System.out.println("================");


    }

    public static void main1(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.createList(5);

        System.out.print("Display: ");
        mySingleList.displayList();
        System.out.println("Size: " + mySingleList.size());
        System.out.println("================");

        mySingleList.addFirst(12);
        System.out.print("Display: ");
        mySingleList.displayList();
        System.out.println("Size: " + mySingleList.size());
        System.out.println("================");

        mySingleList.addFirst(22);
        System.out.print("Display: ");
        mySingleList.displayList();
        System.out.println("Size: " + mySingleList.size());
        System.out.println("================");

        mySingleList.addLast(12);
        System.out.print("Display: ");
        mySingleList.displayList();
        System.out.println("Size: " + mySingleList.size());
        System.out.println("================");

        System.out.println(mySingleList.addIndex(8, 33));
        System.out.print("Display: ");
        mySingleList.displayList();
        System.out.println("Size: " + mySingleList.size());
        System.out.println("================");

        System.out.println(mySingleList.contains(22));
        System.out.println("================");

        mySingleList.remove(33);
        System.out.print("Display: ");
        mySingleList.displayList();
        System.out.println("Size: " + mySingleList.size());
        System.out.println("================");

        mySingleList.remove(2);
        System.out.print("Display: ");
        mySingleList.displayList();
        System.out.println("Size: " + mySingleList.size());
        System.out.println("================");

        mySingleList.removeAllKey(12);
        System.out.print("Display: ");
        mySingleList.displayList();
        System.out.println("Size: " + mySingleList.size());

    }

}
