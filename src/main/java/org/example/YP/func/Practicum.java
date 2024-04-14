package org.example.YP.func;

import java.util.List;
import java.util.stream.Collectors;

public class Practicum {

    public static void main(String[] args) {
        List<Integer> inputNumbers = List.of(2, 5, 4, 2, 3, 8);
        List<Integer> evenNumbers = inputNumbers.stream()
                .filter(number -> number%2 == 0)
                .collect(Collectors.toList());
                System.out.println(evenNumbers);
    }
}