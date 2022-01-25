package com.selvigtech;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args){
        //specify the required space in this case 5
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);

        //Reassign a value
        colors[2] = "green";

        System.out.println(Arrays.toString(colors));

        /* if you know how many items will be in your array
            once you define an array you can't change it
         */
        int[] numbers = {34, 54};

        // looping through an array

        for (int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }

        // looping through an array in reverse

        for (int i = colors.length -1; i >= 0; i--){
            System.out.println(colors[i]);
        }

        // second way of looping through an array
        for (String color : colors){
            System.out.println(color);
        }

        // 3rd way of looping through
        Arrays.stream(colors).forEach(System.out::println);



        // check the size of your array
        System.out.println(colors.length);


    }

}
