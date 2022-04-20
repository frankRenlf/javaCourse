

public class App {

    public static void func1() {
        int[] arr = new int[]{1, 3, 5};
        System.out.println(arr[10]);
    }

    public static void main(String[] args) {
        try {
            func1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("exception");
        }
    }

    public static void main1(String[] args) {

        int[] arr = new int[]{1, 3, 5};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception: ");
            e.printStackTrace();
        }

    }

}
