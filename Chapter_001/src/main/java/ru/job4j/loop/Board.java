package ru.job4j.loop;

public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator(); // содержит перевод на следующую строку
        for (int i = 0 ; i < height; i++ ) {
            for (int j =0; j< width; j++ ) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                int sum = i+j;
                if (sum %2 ==0) {
                    screen.append("X"); //Вставляет содержимое метода
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            System.getProperty("line.separator"); //определяет какая ОС и способ перевода на новую строку
            screen.append(ln); //вставляет содержимое (ln = \r\n) , т.е. пробел
        }
        return screen.toString(); //вывод строки
    }
}
