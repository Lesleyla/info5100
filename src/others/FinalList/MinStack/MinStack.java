package others.FinalList.MinStack;

import java.util.Stack;

//leetcode155
public class MinStack {
    private Stack<Integer> data;
    private Stack<Integer> helper;
    /**
     * initialize your data structure here.
     */
    public MinStack() {
        data = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int val) {
        data.add(val);
        if (helper.isEmpty() || helper.peek() >= val) {
            helper.add(val);
        } else {
            helper.add(helper.peek());
        }
    }

    public void pop() {
        if (!data.isEmpty()) {
            data.pop();
            helper.pop();
        }
    }

    public int top() {
        if (!data.isEmpty()) {
            return data.peek();
        }
        throw new RuntimeException("empty stack!");
    }

    public int getMin() {
        if (!helper.isEmpty()) {
            return helper.peek();
        }
        throw new RuntimeException("empty stack!");
    }
    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
}
