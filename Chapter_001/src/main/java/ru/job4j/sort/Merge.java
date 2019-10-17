package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index = 0;
        int index2 = 0;
        for (int i = 0; i < rsl.length; i++){
            if ( index < left.length && index2 < right.length) {
                if (left[index] <= right[index2]) {
                    rsl[i] = left[index];
                    index++;
                } else {
                    rsl[i] = right[index2];
                    index2++;
                }
            } else if (index < left.length) {
                rsl[i] = left[index];
                index++;
            } else if (index2 < right.length) {
                rsl[i] = right[index2];
                index2++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
