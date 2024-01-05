package com.reactive.reactiveprogrammingjava.fluxAndMono;

import com.reactive.reactiveprogrammingjava.commons.ReactiveSources;

public class ExerciseFluxAndMono {

    public static void main(String[] args) {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()


        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        ReactiveSources.intNumbersFlux().subscribe(System.out::println);

    }

}
