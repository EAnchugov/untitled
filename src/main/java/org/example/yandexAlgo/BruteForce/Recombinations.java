package org.example.yandexAlgo.BruteForce;

import java.util.Scanner;

public class Recombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int pn = permutations(n-1);
        int pk = permutations(k);
        //dividend
        int pd = permutations(n+k - 1);
        int answer = pd/(pn*pk);

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
