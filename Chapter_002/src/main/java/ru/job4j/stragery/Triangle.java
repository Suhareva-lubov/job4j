package ru.job4j.stragery;

import java.util.StringJoiner;

public class Triangle implements Shape {

    @Override
    public String draw() {
            StringBuilder pic = new StringBuilder();
            pic.append("   +   " + System.lineSeparator());
            pic.append("  +++  " + System.lineSeparator());
            pic.append(" +++++ " + System.lineSeparator());
            pic.append("+++++++");
            return pic.toString();
    }
}
