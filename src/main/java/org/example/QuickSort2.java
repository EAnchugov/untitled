package org.example;

import java.util.Arrays;
import java.util.Random;

public class QuickSort2 {
    public static void main(String[] args) {
//        int[] numbers = new int[]{48, 14, 17, 83, 61, 14, 75, 54, 86, 27};
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i =0; i < numbers.length; i++){
            numbers[i] = random.nextInt(90);
        }
        System.out.println("Before");
        System.out.println(Arrays.toString(numbers));
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println("After");
        System.out.println(Arrays.toString(numbers));
    }

    private static void quickSort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex){
            return;
        }

        int pivot = array[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer <= rightPointer) {
            while (array[leftPointer] < pivot) {
                leftPointer++;
            }
            while (array[rightPointer] > pivot) {
                rightPointer--;
            }
            if (leftPointer <= rightPointer) {
                swap(array, leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;
            }
        }

        quickSort(array, lowIndex, rightPointer);
        quickSort(array, leftPointer, highIndex);

    }

    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
