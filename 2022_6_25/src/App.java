import structure.BinarySearchTree;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_6_25
 * @Package : PACKAGE_NAME
 * @createTime : 2022/6/25 10:18
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class App {

    public static void main(String[] args) {
        Map<Student, Integer> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.age - o1.age;
            }
        });
        map.put(new Student("frank",21),1);
        map.put(new Student("lily",11),2);
        System.out.println(map);
    }

    public static void main3(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("student", 1);
        map.put("a", 2);
        map.put("f", 3);
        map.put("b", 4);
        System.out.println(map);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        System.out.println(set);
        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry);
        }
    }


    public static void main2(String[] args) {
        Map<String, Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return CharSequence.compare(o2, o1);
            }
        });
        map.put("d", 1);
        map.put("a", 2);
        map.put("f", 3);
        map.put("b", 4);
        System.out.println(map);

    }


    static BinarySearchTree bst = new BinarySearchTree();


    public static void main1(String[] args) {

        bst.createTree(new int[]{10, 4, 29, 35, 18, 27, 5, 13});
        System.out.println(bst.insert(4));
        bst.inorder();
        System.out.println();

        bst.remove(4);
        bst.remove(27);
        bst.remove(18);
        bst.inorder();
    }

}
