package ru.job4j.array;

public class EndsWith {

    /**
     * проверить. что массив word имеет последние элементы одинаковые с post
     * @param word
     * @param post
     * @return
     */

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
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