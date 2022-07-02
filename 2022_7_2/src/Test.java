import hash.HashBuck;
import impl.Solution;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_7_2
 * @Package : PACKAGE_NAME
 * @createTime : 2022/7/2 11:13
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */

class Person {
    public int id;
    public String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Test {

    public static void main(String[] args) {
        int[] array = new int[10_0000];
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(1_0000);
        }
        Solution sol = new Solution();
        sol.func3(array);
    }

    public static void main3(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
    }

    public static void main2(String[] args) {
        HashBuck<Person, Integer> hashBuck = new HashBuck<>();
        hashBuck.put(new Person(1, "a"), 11);
        hashBuck.put(new Person(2, "c"), 22);
        Person p1 = new Person(3, "d");
        hashBuck.put(p1, 33);
        hashBuck.put(new Person(4, "e"), 44);
        hashBuck.put(new Person(44, "f"), 44);
        hashBuck.put(new Person(12, "f"), 1212);
        System.out.println(hashBuck.get(p1));

    }

    public static void main1(String[] args) {
        HashBuck<Integer, String> hashBuck = new HashBuck<>();
        hashBuck.put(1, "a");
        hashBuck.put(2, "b");
        hashBuck.put(0, "c");
        hashBuck.put(5, "d");
        hashBuck.put(10, "e");
        hashBuck.put(12, "f");
        System.out.println(hashBuck.get(12));
    }

}
