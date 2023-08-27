// 155. Min Stack
// https://leetcode.com/problems/min-stack/description/

import java.util.Stack;

public class MinStackQ155 {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> ss = new Stack<>();

    public MinStackQ155() {

    }

    public void push(int val) {
        s.push(val);
        if (ss.isEmpty() || ss.peek() >= val)
            ss.push(val);
    }

    public void pop() {
        if (s.isEmpty())
            return;
        int temp = s.peek();
        s.pop();
        if (ss.peek() == temp)
            ss.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        if (ss.isEmpty())
            return -1;
        return ss.peek();
    }
}
