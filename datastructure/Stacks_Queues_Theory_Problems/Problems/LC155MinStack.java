package Problems;

import java.util.Stack;

//https://leetcode.com/problems/min-stack/description/
//https://chat.openai.com/share/4c2c0705-40ad-41cc-9198-0fac99163878
public class LC155MinStack {
    Stack<Integer> stack;
    Stack<Integer> stackMin;
    public LC155MinStack() {
        stack = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(int val) {
        int currentMin;
        if (stackMin.isEmpty() || val <= (currentMin = stackMin.peek())){
            stackMin.push(val);
        } else stackMin.push(currentMin);

        stack.push(val);
    }

    public void pop() {
        stack.pop();
        stackMin.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stackMin.peek();
    }
}
