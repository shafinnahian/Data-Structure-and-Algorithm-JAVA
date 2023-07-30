package Stacks;

public class StackMain {
    public static void main(String[] args) throws StackException {  // Something is available in this main function, that throws a StackException.
                                                                    // so we need to throw StackException here too
        CustomStack obj= new CustomStack(5);

        obj.push(34);
        obj.push(45);
        obj.push(78);
        obj.push(98);
        obj.push(8212);

        for (int i = 0; i < 5; i++) {
            System.out.println(obj.pop());
        }
    }
}
