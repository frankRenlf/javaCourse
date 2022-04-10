package course.function.Frank;


import java.util.Arrays;
import java.util.Comparator;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.age - o.age;
//    }
}


class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}


public class TestDemo1 {


    public static void main(String[] args) {
        Student[] students = new Student[]{new Student(12, "frank"), new Student(10, "abc"), new Student(13, "bcd")};
        System.out.println("before: " + Arrays.toString(students));
        AgeComparator ac = new AgeComparator();
        Arrays.sort(students, ac);
        System.out.println("after: " + Arrays.toString(students));
    }


}
