package org.example;

import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.sort;

public class bubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i =0; i < numbers.length; i++){
            numbers[i] = random.nextInt(90);
        }
        System.out.println("Before");
        System.out.println(Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("After");
        System.out.println(Arrays.toString(numbers));
    }
    public static void bubbleSort (int[] numbers){
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i -1; j++) {
                if (numbers[j] > numbers[j+1]){
                    swap(numbers, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;

    }

}
