package easy;

import java.util.Stack;

public class Problem43 {

    static class MyStack {
        Stack<Integer> stack = new Stack<>();
        int max;

        void getMax() {
            if (stack.empty())
                System.out.println("Stack empty");
            else
                System.out.println("Max element is " + max);
        }

        void push(int x) {
            if (stack.empty() || x > max) {
                max = x;
            }

            stack.push(x);
            System.out.println(x + " inserted");
        }

        void peek() {
            if (stack.empty()) {
                System.out.println("Stack empty");
            } else {
                System.out.println("Top element is " + stack.peek());
            }
        }

        void pop() {
            if (stack.empty())
                System.out.println("Stack empty");
            else {
                int t = stack.pop();
                System.out.println(t + " removed");
            }
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(5);
        stack.getMax();
        stack.pop();
    }
}
