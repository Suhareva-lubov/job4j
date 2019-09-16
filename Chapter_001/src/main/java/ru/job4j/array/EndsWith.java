package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        // проверить. что массив word имеет последние элементы одинаковые с post
        int k = (word.length - 1);
        for (int i = (post.length - 1); i >= 0; i--) {
            if (word[k] != post[i]) {
                  result = false;
                  break;
              }
              k--;

        }
        return result;
    }
}