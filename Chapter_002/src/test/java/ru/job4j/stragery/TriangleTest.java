package ru.job4j.stragery;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void WhenDrawtriagle() {
        Triangle triangle = new Triangle();
        assertThat(triangle.draw(), is(new StringJoiner(System.lineSeparator())
                .add("   +   ")
                .add("  +++  ")
                .add(" +++++ ")
                .add("+++++++")
                .toString()
                )
        );
    }
}
