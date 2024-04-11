package org.example.yandexAlgo.BruteForce;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int n = 3;
        int k = 1;
        for (int i = 1; i < n + 1; i++) {
            k = k * i;
        }
        System.out.println(k);
    }
}
