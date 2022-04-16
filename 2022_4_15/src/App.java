import java.util.Arrays;

class Student {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class App {

    public static void test1(int a){
        a=2;
    }

    public static void main(String[] args) {
        int a= 1;
        test1(a);
        System.out.println(a);
    }

    public static void main11(String[] args) {
        String s1 = "abc" + "def";//1
        String s2 = new String(s1);//2
        if (s1.equals(s2))//3
            System.out.println(".equals succeeded");//4
        if (s1 == s2)//5
            System.out.println("==succeeded");//6
    }

    public static boolean isAdmin(String userId) {
        return userId.toLowerCase() == "admin";
    }

    public static void main10(String[] args) {
        System.out.println(isAdmin("Admin"));
    }

    public static void main9(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }

    public static void main8(String[] args) {
        String str = "hello world";
        System.out.println(str.substring(5));
        System.out.println(str.substring(0, 5));
    }


    public static void main7(String[] args) {
        String s1 = new String("hello world");
        String[] sl = s1.split("el|o");
        for (String x : sl) {
            System.out.println(x);
        }
    }

    public static void main6(String[] args) {
        String s1 = new String("hello world");
        System.out.println(s1.replace("el", "a"));
        System.out.println(s1.replace("o", "abc"));
    }

    public static void main5(String[] args) {
        String s1 = "hello";
        String s2 = "HELLO"; // 小写转大写
        System.out.println(s1.toUpperCase()); // 大写转小写
        System.out.println(s2.toLowerCase());
    }

    public static void main4(String[] args) {
        String s1 = String.valueOf(1234);
        String s2 = String.valueOf(12.34);
        String s3 = String.valueOf(true);
        String s4 = String.valueOf(new Student("Hanmeimei", 18));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("================================="); // 字符串转数字 // 注意：Integer、Double等是Java中的包装类型，这个后面会讲到
        int data1 = Integer.parseInt(s1, 8);
        double data2 = Double.parseDouble(s2);
        System.out.println(data1);
        System.out.println(data2);
    }

    public static void main3(String[] args) {
        String s1 = new String("Hello world");
        System.out.println(s1.indexOf('o'));
        System.out.println(s1.indexOf("wo"));
        System.out.println(s1.indexOf("o", 5));
    }

    public static void main2(String[] args) {
        String s1 = new String("123");
        String s2 = "122";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
    }

    public static void main1(String[] args) {
        String s1 = new String("123");
        String s2 = "456";
        String s3 = s1;
        System.out.println("=====");
    }

}
