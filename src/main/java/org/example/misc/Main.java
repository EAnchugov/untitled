package org.example.misc;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
//        String[] parts = reader.readLine().split(" ");
//        int[] nums = new int[parts.length];
//        for (int i = 0; i < parts.length; i++) {
//            nums[i] = Integer.parseInt(parts[i]);
//        }
//        Solution.solution(nums);
//        reader.close();
//        writer.close();
        QuickSort.solution(new int[]{3,14,1,7,9,8,11,6,4,2});
    }
}