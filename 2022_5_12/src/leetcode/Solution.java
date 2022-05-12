package leetcode;

import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '#') {
                stack1.pop();
            } else {
                stack1.push(x);
            }
        }
        for (char x : t.toCharArray()) {
            if (x == '#') {
                stack2.pop();
            } else {
                stack2.push(x);
            }
        }
        while (!stack1.isEmpty()) {
            if (stack1.pop() != stack2.pop()) {
                return false;
            }
        }
        return stack2.isEmpty();
    }
}
