
import leetcode.Solution;
import structure.TestHeap;
import structure.TestHeap_E;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_5_27
 * @Package : PACKAGE_NAME
 * @createTime : 2022/5/27 10:34
 * @Email : sc19lr@leeds.ac.uk
 * @github : <a href="https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30">...</a>
 * @Description :
 */


class IntCmp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

class Student {
    int age;

    public Student(int age) {
        this.age = age;
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.age - o.age;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}

public class App {

    public static void main5(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.smallestK2(new int[]{9, 2, 1, 3, 5, 7, 8}, 3)));

    }

    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.age-o1.age;
            }
        });
        priorityQueue.offer(new Student(7));
        priorityQueue.offer(new Student(10));
        priorityQueue.offer(new Student(9));
        System.out.println(priorityQueue.toString());

    }


    public static void main3(String[] args) {
        IntCmp intCmp = new IntCmp();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (int) o1 - (int) o2;
            }
        });
        priorityQueue.offer(5);
        priorityQueue.offer(3);
        priorityQueue.offer(2);
        System.out.println(priorityQueue.toString());

    }

    public static void main2(String[] args) {
        TestHeap testHeap = new TestHeap(10);
        testHeap.createHeap(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        testHeap.push(50);
        testHeap.pollHeap();
        testHeap.display();
        testHeap.heapSort();
        testHeap.display();

    }


    public static void main1(String[] args) {
        Integer[] array = new Integer[]{1, 3, 5, 6, 6, 7, 8, 9, 10, 12};
        Comparator<? super Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        TestHeap_E<Integer> testHeap = new TestHeap_E<>(Integer.class, comparator);
        testHeap.createHeap(array);
        testHeap.display();
    }

}
