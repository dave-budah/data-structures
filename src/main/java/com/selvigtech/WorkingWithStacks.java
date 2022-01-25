package com.selvigtech;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //Peek: top to the stack
        System.out.println(stack.peek());
        // Pop: remove form the stack
        System.out.println(stack.pop());
        // Size: checking size
        System.out.println(stack.size());
    }
}
