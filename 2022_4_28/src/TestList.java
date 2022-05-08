import mySingleList.MySingleList;

public class TestList {

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.findDuplicates(new int[]{1, 3, 3, 2, 2, 1, 4}));
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

        System.out.println(mySingleList.chkPalindrome());

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
