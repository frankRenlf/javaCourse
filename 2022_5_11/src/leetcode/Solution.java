package leetcode;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if (s.isEmpty())
            return true;
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.empty() || c != stack.pop())
                return false;
        }
        return stack.empty();
    }

    public boolean isNumber(String token) {
        return !("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token));
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (isNumber(s)) {
                stack.push(Integer.parseInt(s));
            } else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch (s) {
                    case "+" -> stack.push(num1 + num2);
                    case "-" -> stack.push(num1 - num2);
                    case "*" -> stack.push(num1 * num2);
                    case "/" -> stack.push(num1 / num2);
                    default -> {
                    }
                }
            }
        }
        return stack.pop();
    }

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        int len = pushA.length;
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < len; i++) {
            while (index < len && (stack.empty() || stack.peek() != popA[i])) {
                stack.push(pushA[index]);
                index++;
            }
            if (stack.peek() == popA[i]) {
                stack.pop();
            } else {
                return false;
            }
        }
        return true;
    }

}
