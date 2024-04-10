package org.example.coderun;

import java.io.*;

public class MiddleElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] parts = reader.readLine().split(" ");
        int[] num = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            num[i] = Integer.parseInt(parts[i]);
        }
        bubbleSort(num);
        writer.write(String.valueOf(num[1]));
        reader.close();
        writer.close();
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
