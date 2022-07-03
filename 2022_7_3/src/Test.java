import enumDemo.TestEnum;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_7_3
 * @Package : PACKAGE_NAME
 * @createTime : 2022/7/3 9:09
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
public class Test {

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("enumDemo.TestEnum");
            Constructor<?> constructor = c.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);
            TestEnum testEnum = (TestEnum) constructor.newInstance("black", 2);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main1(String[] args) {
        Class c3 = null;
        try {
            c3 = Class.forName("reflectDemo.Student");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
