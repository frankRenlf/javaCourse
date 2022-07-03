package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.function.Consumer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_7_3
 * @Package : lambda
 * @createTime : 2022/7/3 10:42
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */

//无返回值无参数
@FunctionalInterface
interface NoParameterNoReturn {
    void test();
}//无返回值一个参

@FunctionalInterface
interface OneParameterNoReturn {
    void test(int a);
}//无返回值多个参数

@FunctionalInterface
interface MoreParameterNoReturn {
    void test(int a, int b);
}

//有返回值无参数
@FunctionalInterface
interface NoParameterReturn {
    int test();
}


//有返回值一个参数
@FunctionalInterface
interface OneParameterReturn {
    int test(int a);
}//有返回值多参数

@FunctionalInterface
interface MoreParameterReturn {
    int test(int a, int b);
//    int test2(int x);
}

class IMPL {
    MoreParameterReturn more;

    public IMPL(MoreParameterReturn tmp) {
        this.more = tmp;
    }

    public void test(int a) {
        if (a > more.test(a, a + 1)) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }

}

public class TestLambda {

    public static void main5(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println();
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        IMPL moreParameterReturn = new IMPL(new MoreParameterReturn() {
            @Override
            public int test(int a, int b) {
                return a - b;
            }
        });

        IMPL impl = new IMPL((a, b) -> {
            return a + b;
        });

        impl.test(1);
    }


    public static void main3(String[] args) {
        OneParameterReturn oneParameterReturn = (int a) -> {
            return a * 2;
        };
    }

    public static void main2(String[] args) {
        NoParameterNoReturn noParameterNoReturn = new NoParameterNoReturn() {
            @Override
            public void test() {
                System.out.println("noParameterNoReturn");
            }
        };
        NoParameterNoReturn noParameterNoReturn2 = () -> {
            System.out.println("123");
        };

    }

    public static void main1(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>((Integer a, Integer b) -> {
            return a - b;
        });
    }

}
