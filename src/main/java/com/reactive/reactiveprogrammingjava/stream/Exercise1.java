package com.reactive.reactiveprogrammingjava.stream;

import com.reactive.reactiveprogrammingjava.commons.ReactiveSources;
import com.reactive.reactiveprogrammingjava.commons.StreamSources;
import com.reactive.reactiveprogrammingjava.commons.User;
import org.hibernate.annotations.CurrentTimestamp;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Print numbers from intNumbersStream that are less than 5
        StreamSources.intNumbersStream().forEach(number -> {
            System.out.println(number < 5 ? number : ""); // Print if number is less than 5
        });


        // Print the second and third numbers in intNumbersStream that's greater than 5
        StreamSources.intNumbersStream().filter(number -> number>5)
                .skip(1)
                .limit(2)
                .forEach(System.out::println);


        //  Print the first number in intNumbersStream that's greater than 5.
        System.out.println(StreamSources.intNumbersStream().filter(number -> number > 5).findFirst().orElse(-1));


        // Print first names of all users in userStream

        System.out.println("map start -> "+LocalDateTime.now());
        StreamSources.userStream().map(User::getFirstName)
                .forEach(System.out::println);
        System.out.println("map end -> "+LocalDateTime.now());


        System.out.println("for start -> "+LocalDateTime.now());
        StreamSources.userStream().forEach(user -> {
            System.out.println(user.getFirstName());
        });
        System.out.println("for end -> "+LocalDateTime.now());



        // Print first names in userStream for users that have IDs from number stream

        System.out.println("----------");
        StreamSources.userStream()
                .filter(u -> StreamSources.intNumbersStream().anyMatch(id -> u.getId() == id))
                .forEach(user -> System.out.println(user.getFirstName()));



    }
}
