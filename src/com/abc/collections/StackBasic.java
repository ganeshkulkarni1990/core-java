package com.abc.collections;

import javax.swing.*;
import java.util.*;

enum Op {
    PUSH, POP, IS_EMPTY;
}

public class StackBasic {

    private static void push(Stack stack) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter element:");
        String input = s.next();
        stack.add(input);
    }

    private static void pop(Stack stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        String element = (String) stack.pop();
        System.out.println("Popped element:" + element);
    }

    private static void isEmpty(Stack stack) {
        System.out.println("isEmpty:" + stack.isEmpty());
    }

    private static void print(Stack stack) {
        if (stack.size() == 0) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println(stack);
    }

    private static void print(Queue q) {
        if (q.size() == 0) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(q);
    }

    private static void testStack() {
        Stack stack = new Stack();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter choice:");
            int ch = s.nextInt();
            switch (ch) {
                case 0:
                    push(stack);
                    break;
                case 1:
                    pop(stack);
                    break;
                case 2:
                    isEmpty(stack);
                    break;
                case 3:
                    System.out.println("Size:" + stack.size());
                    break;
                case 5:
                    print(stack);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    private static void insert(Queue q) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter element:");
        String input = s.next();
        q.add(input);
    }

    private static void delete(Queue q) {
        if (q.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        String element = (String) q.poll();
        System.out.println("Deleted element:" + element);
    }

    private static void testQueue() {
        Queue queue = new LinkedList();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter choice:");
            int ch = s.nextInt();
            switch (ch) {
                case 0:
                    insert(queue);
                    break;
                case 1:
                    delete(queue);
                    break;
                case 2:
                    System.out.println("Is Empty:" + queue.isEmpty());
                    break;
                case 3:
                    System.out.println("Size:" + queue.size());
                    break;
                case 5:
                    print(queue);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    private static boolean isOpenParenthesis(char c) {
        if (c == '(' || c == '{' || c == '[') {
            return true;
        }
        return false;
    }

    private static boolean isClosing(Stack<Character> st, char c) {
        if (st.isEmpty()) {
            return false;
        }
        if (c == '}' && st.peek() == '{') {
            st.pop();
            return true;
        } else if (c == ']' && st.peek() == '[') {
            st.pop();
            return true;
        } else if (c == ')' && st.peek() == '(') {
            st.pop();
            return true;
        }
        return false;
    }

    private static boolean checkBalancedParenthesis(String s) {
        Stack<Character> stack = new Stack();
        s = s.trim();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            boolean isOpenPara = isOpenParenthesis(c);
            if (isOpenPara == true) {
                stack.push(c);
                //System.out.println(stack);
            } else {
                boolean isClosing = isClosing(stack, c);
                if (isClosing == false) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String... args) {
//        Stack stack = new Stack();
//        stack.add("ganesh");
//        stack.add(10);
//        stack.add(false);
//        stack.add('A');
//        stack.add(10.0d);
//
//        // System.out.println(stack);
//
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
//        testStack();
        //testQueue();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter input");
            String input = s.next();
            boolean isBalanced = checkBalancedParenthesis(input);
            if (isBalanced) {
                System.out.println("BALANCED PARENTHESIS");
            } else {
                System.out.println("NOT BALANCED PARENTHESIS");
            }
        }

    }
}
