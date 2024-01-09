package com.reactive.reactiveprogrammingjava.fluxAndMono;

import com.reactive.reactiveprogrammingjava.commons.ReactiveSources;

import java.util.List;

public class ExerciseFlux2 {

    public static void main(String[] args) {
        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size

        List<Integer> list = ReactiveSources.intNumbersFlux().toStream().toList();
        System.out.println("List is -> "+ list);
        System.out.println("Size of List is -> "+ list.size());




    }

}
