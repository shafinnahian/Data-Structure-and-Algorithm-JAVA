package Stacks_Queues_Theory_Problems;

import java.util.*;
public class InBuiltExamples {
    public static void main(String[] args) {
        Stack <Integer> obj = new Stack<>();

        obj.push(34);
        obj.push(45);
        obj.push(78);
        obj.push(98);
        obj.push(8212);
        
        for (int i = 0; i < 5; i++) {
            System.out.println(obj.pop());
        }
        System.out.println();

        Queue <Integer> obj2 = new LinkedList<>();

        obj2.add(12);
        obj2.add(23);
        obj2.add(45);
        obj2.add(50);
        obj2.add(60);

        for (int i = 0; i < 5; i++) {
            System.out.println(obj2.remove());
        }

        Deque<Integer> deque = new ArrayDeque<>();
    }
}
