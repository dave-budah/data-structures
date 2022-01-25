package com.selvigtech;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args){
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person( "Dave", 21));
        supermarket.add(new Person( "Craig", 24));
        supermarket.add(new Person( "Kyle", 25));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
    }
    static record Person(String name, int age){}
}
