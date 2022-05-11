import java.util.Stack;

import Stack.MyStack;
import leetcode.Solution;

public class App {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] s = {"2", "1", "+", "3", "*"};
        String[] s3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(sol.evalRPN(s3));
    }

    public static void main3(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isValid("{[]}"));
    }

    public static void main2(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        for (int i = 0; i < 10; i++) {
            myStack.push(i);
        }
        System.out.println(myStack);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack);

        myStack.push(12);
        myStack.push(13);
        System.out.println(myStack);
    }

    public static void main1(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);

        System.out.println(s.size()); // 获取栈中有效元素个数---> 4
        System.out.println(s.peek()); // 获取栈顶元素---> 4
        s.pop(); // 4出栈，栈中剩余1 2 3，栈顶元素为3
        System.out.println(s.pop()); // 3出栈，栈中剩余1 2 栈顶元素为3
        if (s.empty()) {
            System.out.println("栈空");
        } else {
            System.out.println(s.size());
        }
        System.out.println(s);
    }

}
