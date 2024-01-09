package com.reactive.reactiveprogrammingjava.fluxAndMono;

import com.reactive.reactiveprogrammingjava.commons.ReactiveSources;
import com.reactive.reactiveprogrammingjava.commons.User;

import java.io.IOException;

public class ExerciseMono1 {

    public static void main(String[] args) throws IOException {
        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono().subscribe(System.out::println);

        // Get the value from the Mono into an integer variable
        Integer number = ReactiveSources.intNumberMono().block();
        User user = ReactiveSources.userMono().block();

        System.out.println("Number is " + number);
        System.out.println("User is " + user);

        //one should avoid mono, because block() is not a good way to use

        System.out.println("Press a key to end");
        System.in.read();
    }

}
