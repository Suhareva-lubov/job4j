package ru.job4j.loop;

public class Board {

    /**
     * lineSeparator() перевод на следующую строку
     * Проверяет что писать Х или пробел, вставляет содежимое метода, добавляем перевод на новую строку, определяет какая ОС и способ перевода на новую строку
     * вставляет содержимое (ln = \r\n) , т.е. пробел
     * screen.toString(); //вывод строки
     * @param width
     * @param height
     * @return
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            System.getProperty("line.separator");
            screen.append(ln);
        }
        return screen.toString();
    }
}
