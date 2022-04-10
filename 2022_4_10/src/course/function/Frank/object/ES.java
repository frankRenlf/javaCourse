package course.function.Frank.object;


import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && this.name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    //    @Override
//    public boolean equals(Object obj) {
//        return this.age == ((Student) obj).age && Objects.equals(this.name, ((Student) obj).name);
//    }
}


public class ES {

    public static void main(String[] args) {
        Student s1 = new Student(12,"Frank");
        Student s2 = new Student(12,"Frank");
        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }

}
