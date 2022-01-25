package com.selvigtech;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args){
        // Tell your list the data types that you are using in the <-->
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("grey");
        System.out.println(colors.size());
        System.out.println(colors.contains("blue"));
        System.out.println(colors);

        for (String color : colors) {
            System.out.println(color);
        }
        colors.forEach(System.out::println);
    }
}
