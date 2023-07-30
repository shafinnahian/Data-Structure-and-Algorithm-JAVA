package Problems;

import java.util.Stack;

// Google
//https://leetcode.com/problems/implement-queue-using-stacks/
//https://leetcode.com/problems/implement-queue-using-stacks/solutions/3836428/beat-100-runtime-java-w-thorough-explanation/
public class LC232QueueByStacks {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack();

        stack.push(5);
        System.out.println(stack.pop());
    }
}

class QueueUsingStack{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }

//    public void add(int item){
//        first.push(item);
//    }

    public void add(int item){
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        first.push(item);

        while (!second.isEmpty()){
            first.push(second.pop());
        }
    }

    public int remove() throws Exception{
        return first.pop();
    }

//    public int remove() throws Exception{
//        while(!first.isEmpty()){
//            second.push(first.pop());
//        }
//
//        int removed = second.pop();
//
//        while(!second.isEmpty()) {
//            first.push(second.pop());
//        }
//
//        return removed;
//    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

    public int peek() throws Exception{
        return first.peek();
    }
//    public int peek() throws Exception{
//        while(!first.isEmpty()){
//            second.push(first.pop());
//        }
//
//        int peeked = second.peek();
//
//        while(!second.isEmpty()) {
//            first.push(second.pop());
//        }
//
//        return peeked;
//    }
}
