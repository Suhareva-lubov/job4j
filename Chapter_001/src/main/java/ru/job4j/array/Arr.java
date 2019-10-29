package ru.job4j.array;

public class Arr {
    public int[] sort(int[] left, int[] right) {
        int index = 0;
        for (int i = 0; i < left.length; i++) {
            for (int k = 0; k < right.length; k++) {
                if (left[i] == right[k]) {
                    index++;
                }
            }
        }
        int[] rsl = new int[index];
        index = 0;
        for (int j = 0; j < left.length; j++) {
            for (int k = 0; k < right.length; k++) {
                if (left[j] == right[k]) {
                    rsl[index] = left[j];
                    index++;
                }
            }
        }
        return rsl;
    }
}