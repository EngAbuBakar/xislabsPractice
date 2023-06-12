package Collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);


        //System.out.println(stack.peek());
        // Search method will return the index of that element
       // System.out.println(stack.search("Ali"));
        //System.out.println(stack);
        while (!stack.isEmpty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
