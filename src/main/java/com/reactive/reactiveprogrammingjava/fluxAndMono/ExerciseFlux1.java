package com.reactive.reactiveprogrammingjava.fluxAndMono;

import com.reactive.reactiveprogrammingjava.commons.ReactiveSources;

import java.io.IOException;

public class ExerciseFlux1 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        ReactiveSources.intNumbersFlux().subscribe(System.out::println);


        // Print all users in the ReactiveSources.userFlux stream
        ReactiveSources.userFlux().subscribe(System.out::println);


        //subscribe() executes as soon as the print line happens! without an action subscribe will not happen
        //ordering is not deterministic
        System.out.println("Press a key to end\n");
        System.in.read();



    }

}
