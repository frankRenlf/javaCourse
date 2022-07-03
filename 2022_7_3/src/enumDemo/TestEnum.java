package enumDemo;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_7_3
 * @Package : enumDemo
 * @createTime : 2022/7/3 10:09
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
public enum TestEnum {
    RED("red", 1), BLACK("black", 2), WHITE("white", 3), GREEN("green", 4);
    private String name;
    private int key;

    /**
     * 1、当枚举对象有参数后，需要提供相应的构造函数
     * 2、枚举的构造函数默认是私有的 这个一定要记住
     *
     * @param name
     * @param key
     */

    private TestEnum(String name, int key) {
        this.name = name;
        this.key = key;
    }

    public static TestEnum getEnumKey(int key) {
        for (TestEnum t : TestEnum.values()) {
            if (t.key == key) {
                return t;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TestEnum[] testEnums = TestEnum.values();
        for (int i = 0; i < testEnums.length; i++) {
            System.out.println(testEnums[i] + ": " + testEnums[i].ordinal());
        }
    }

    public static void main1(String[] args) {
        TestEnum testEnum2 = TestEnum.BLACK;
//        values();// 以数组形式返回枚举类型的所有成员
//        ordinal();// 获取枚举成员的索引位置
//        valueOf();// 将普通字符串转换为枚举实例
//        compareTo();// 比较两个枚举成员在定义时的顺序
//        2、常用方法
        //Enum 类的常用方法
        //示例一：
        switch (testEnum2) {
            case RED:
                System.out.println("red");
                break;
            case BLACK:
                System.out.println("black");
                break;
            case WHITE:
                System.out.println("WHITE");
                break;
            case GREEN:
                System.out.println("black");
                break;
            default:
                break;
        }
    }

}
