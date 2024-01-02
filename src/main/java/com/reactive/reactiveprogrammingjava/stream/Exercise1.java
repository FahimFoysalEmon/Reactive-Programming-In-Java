package com.reactive.reactiveprogrammingjava.stream;

import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Print numbers from intNumbersStream that are less than 5
        numbers.stream().forEach(number -> {
            System.out.println(number < 5 ? number : ""); // Print if number is less than 5
        });


        // Print the second and third numbers in intNumbersStream that's greater than 5
        numbers.stream().filter(number -> number>5)
                .skip(1)
                .limit(2)
                .forEach(System.out::println);


        //  Print the first number in intNumbersStream that's greater than 5.
        System.out.println(numbers.stream().filter(number -> number > 5).findFirst().orElse(-1));

    }
}
