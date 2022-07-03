package reflectDemo;

import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_7_3
 * @Package : reflectDemo
 * @createTime : 2022/7/3 9:29
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
public class ReflectClassDemo {

    /*
     * reflect to gain the object
     */

    public static void reflectNewInstance() {

    }

    public static void reflectPrivateField() {
        try {
            Class<?> classStudent = Class.forName("reflectDemo.Student");
            Field field = classStudent.getDeclaredField("name");
            field.setAccessible(true); //可以修改该属性的值
            Object objectStudent = classStudent.newInstance();
            Student student = (Student) objectStudent;
            field.set(student, "小明");
            String name = (String) field.get(student);
            System.out.println("反射私有属性修改了name：" + name);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        reflectPrivateField();
    }

}
