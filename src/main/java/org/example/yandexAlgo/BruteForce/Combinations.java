package org.example.yandexAlgo.BruteForce;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
//        int n =7;
//        int k = 5;

        int pn = permutations(n);
        int pk = permutations(k);
        int pnk = permutations(n-k);
        int answer = pn/(pnk*pk);

        System.out.println(answer);

    }

    private static int permutations(int n) {
        int k = 1;
        for (int i = 1; i < n + 1; i++) {
            k = k * i;
        }
        return k;
    }
}
