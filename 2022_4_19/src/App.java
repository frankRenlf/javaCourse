public class App {

    public static int func() {

        try {
            System.out.println(1/0);
            return -1;
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("123");
        }
        return 12;
    }


    public static void main(String[] args) {
        System.out.println(func());
    }

}
