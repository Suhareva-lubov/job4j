package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        if (first <= second ? true : false) {
            result = second;
            if (second <= third ? true : false) {
                result = third ;
            }
        }

        if (first <= third ? true : false) {
            result = third;
            if (third <= second ? true : false) {
                result = second;
            }
        }

        return result;
    }
}
