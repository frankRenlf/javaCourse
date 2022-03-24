import java.util.Arrays;
import java.util.Scanner;


class Person{
    public char[] name;
    public int age;

    public void setAge(int age){
        this.age = age;
    }

    public void setName(char[] name){
        this.name = name;
    }
}

public class App2{
    public static void main(String[] args) {
        Person per = new Person();
        per.setAge(12);
//        per.age=13;
        System.out.println(per.age);
    }
}


//public class App2 {
//    public static void main(String[] args) {
//        int[] arr = new int[10];
//        Scanner sc = new Scanner(System.in);
//        for(int i =0;i<10;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}
