package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i < data.length; i++) {
           if (i == (finish + 1)) {
               break;
           }
           if (data[i] == el) {
               rst = i;
               break;
           }
        }
        return rst;
    }

    public int[] sort(int[] data) {
        for (int i = 0; i < (data.length - 1); i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp;
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;
    }
}
