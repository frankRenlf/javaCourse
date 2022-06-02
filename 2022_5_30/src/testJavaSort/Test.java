package testJavaSort;

import java.util.*;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_5_30
 * @Package : testJavaSort
 * @createTime : 2022/6/2 11:05
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */


public class Test {



    public static void main(String[] args) {

        List<TestA> listA = new ArrayList<TestA>();

        //TestA 即是上面类

        TestA a1 = new TestA();

        a1.setName("张三");

        a1.setOrder(1);

        listA.add(a1);

        TestA a5 = new TestA();

        a5.setName("王屋");

        a5.setOrder(5);

        listA.add(a5);

        TestA a3 = new TestA();

        a3.setName("刘六");

        a3.setOrder(3);

        listA.add(a3);

        listA.sort(new TestA());

        System.out.println();
//也可以这么干,TestA里不实现Comparator接口排序,在真正调用sort时再排序,如下:

//        Collections.sort(listA, new Comparator<TestA>() {
//
//            @Override
//
//            public int compare(TestA o1, TestA o2) {
//
//                //升序
//
//                return o1.getOrder().compareTo(o2.getOrder());
//
//            }
//
//        });
    }
}
