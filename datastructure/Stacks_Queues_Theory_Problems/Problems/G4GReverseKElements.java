package Problems;

//https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class G4GReverseKElements {
    public static void main(String[] args) {
        Queue <Integer> test = new ArrayDeque<>();
        for (int i = 1; i < 6; i++) {
            test.add(i);
        }

        System.out.println(modifyQueue(test, 3));
    }
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        if (!q.isEmpty() && k > 0 && k <= q.size()) {
            Stack<Integer> reversedLine = new Stack<>();

            // Step 1: Push the first k elements of the queue into the stack
            for (int i = 0; i < k; i++) {
                reversedLine.push(q.poll());
            }

            Queue<Integer> ans = new LinkedList<>();

            // Step 2: Pop elements from the stack and enqueue them back into the queue
            while (!reversedLine.isEmpty()) {
                ans.add(reversedLine.pop());
            }

            // Step 3: Enqueue the remaining elements of the original queue
            while (!q.isEmpty()) {
                ans.add(q.poll());
            }

            return ans;
        }

        return q; // Return the unchanged queue if k is invalid or queue is empty
    }

}
