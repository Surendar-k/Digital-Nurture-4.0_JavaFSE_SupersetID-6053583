package junittest;

import static org.junit.Assert.*;
import org.junit.Test;

public class Testcase {

    @Test
    public void test() {
        Addition ab = new Addition();
        int actual = ab.add(10, 50);
        int expected = 60;
        assertEquals(expected, actual);
    }
}
