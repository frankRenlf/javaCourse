package testJavaSort;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_5_30
 * @Package : testJavaSort
 * @createTime : 2022/6/2 11:07
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
public class TestA implements Comparator<TestA> {


    private static final long serialVersionUID = -8968350748602548887L;


    private String name;


    //变量类型必须要为int的封装类型，因为只有是封装类型才可以调用Integer的方法

    private Integer order;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public int compare(TestA o1, TestA o2) {

        //升序

        return o1.getOrder().compareTo(o2.getOrder());

    }

}
