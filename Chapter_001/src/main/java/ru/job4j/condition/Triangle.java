package ru.job4j.condition;

public class Triangle {

    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * Формула.
     *
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return полуперимента.
     */
    public double period(double a, double b, double c) {
        double p = (a + b + c) / 2.0;
        return p;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return
     */
    private boolean exist(double a, double c, double b) {
        return a < b + c && b < c + a && c < a + b ? true : false;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * Формула.
     *
     * √ p *(p - a) * (p - b) * (p - c)
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */

    public double area(Point a, Point b, Point c) {
        double rsl = -1;
        double storona_a = a.distance(b);
        double storona_b = b.distance(c);
        double storona_c = a.distance(c);

        double p = period(storona_a, storona_b, storona_c);
        if (this.exist(storona_a, storona_b, storona_c)) {
            rsl = Math.sqrt(p * (p - storona_a) * (p - storona_b) * (p - storona_c));
        }
        return rsl;
    }
}