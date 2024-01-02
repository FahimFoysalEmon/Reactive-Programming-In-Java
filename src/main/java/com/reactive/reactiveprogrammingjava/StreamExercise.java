package com.reactive.reactiveprogrammingjava;

import java.util.Arrays;
import java.util.List;

public class StreamExercise {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("\nUsing Typical For Loop");

        //typical loop
        for (int i = 0 ; i < numbers.size() ; i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("\n\n\nUsing Streams");

        //using stream
        numbers.stream().forEach(number -> System.out.println(number));


    }
}
