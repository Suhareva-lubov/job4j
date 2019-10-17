package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        double dolg = ((percent / 100) + 1.0) * amount;
        double payYear = 12 * monthly;
        while (dolg > 0) {
            dolg = dolg - payYear;
            year++;
        }
        return year;
    }
}
